package co.uncetral.sistemas.AppInsumos.servicios;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.entidades.VentasEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.VentaOperaciones;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Service
public class VentaServicio implements VentaOperaciones {

    @Autowired
    RepositorioProductos repositorioProductos;

    @Transactional
    @Override
    public VentasEntidades registrarVenta(List<ProductosEntidades> productosVendidos) {
        VentasEntidades venta = new VentasEntidades();

        int totalCantidad = productosVendidos.stream().mapToInt(ProductosEntidades::getCantidad).sum();
        double totalPrecio = productosVendidos.stream().mapToDouble(p -> p.getCantidad() * p.getPrecio()).sum();

        // Aplicar descuento si la cantidad total de productos es mayor a 10
        double descuento = 0;
        if (totalCantidad > 10) {
            descuento = totalPrecio * 0.25;
            totalPrecio = totalPrecio - descuento;
        }

        // Registrar la venta
        venta.setProductos(productosVendidos);
        venta.setTotal(totalPrecio);
        venta.setDescuento(descuento);

        // Actualizar el inventario
        for (ProductosEntidades productoVendido : productosVendidos) {
            ProductosEntidades productoEnInventario = repositorioProductos.findById(productoVendido.getCodigo()).orElseThrow();
            int nuevaCantidad = productoEnInventario.getCantidad() - productoVendido.getCantidad();
            productoEnInventario.setCantidad(nuevaCantidad);
            repositorioProductos.save(productoEnInventario);
        }

        return venta;
    }
}


