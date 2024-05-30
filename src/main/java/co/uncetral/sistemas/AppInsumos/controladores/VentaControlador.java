package co.uncetral.sistemas.AppInsumos.controladores;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.entidades.VentasEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProductoOperaciones;
import co.uncetral.sistemas.AppInsumos.operaciones.VentaOperaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VentaControlador {

    @Autowired
    VentaOperaciones ventaOperaciones;

    @Autowired
    ProductoOperaciones productoOperaciones; // Para obtener los productos disponibles

    @GetMapping("/ventas/nueva")
    public String mostrarFormularioVenta(Model modelo) {
        List<ProductosEntidades> productos = productoOperaciones.consultar();
        modelo.addAttribute("productos", productos);
        return "nueva_venta";
    }

    @PostMapping("/ventas/registrar")
    public String registrarVenta(@RequestParam List<Long> productoIds, @RequestParam List<Integer> cantidades, Model modelo) {
        List<ProductosEntidades> productos = productoOperaciones.consultarPorIds(productoIds); // Debes implementar este método en ProductoOperaciones y ProductoServicio
        for (int i = 0; i < productos.size(); i++) {
            productos.get(i).setCantidad(cantidades.get(i));
        }
        VentasEntidades venta = ventaOperaciones.registrarVenta(productos);
        modelo.addAttribute("venta", venta);
        return "resultado_venta";
    }
}
