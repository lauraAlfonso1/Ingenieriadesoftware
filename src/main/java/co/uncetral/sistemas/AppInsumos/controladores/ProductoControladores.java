package co.uncetral.sistemas.AppInsumos.controladores;


import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProductoOperaciones;
import co.uncetral.sistemas.AppInsumos.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductoControladores {
    @Autowired
    ProductoOperaciones productoOperaciones;


    @GetMapping("/productos/ventas")
    public String ventas(Model modelo) {
        modelo.addAttribute("productos",productoOperaciones.consultar());
        return "venta_productos";
    }
    //Crear el post mapping en donde cuando se de click a vender restar las cantidades seleccionadas con el total
    @PostMapping("/productos/actualizar-cantidades")
    public String actualizarCantidades(@ModelAttribute ("ventas") List <ProductosEntidades> productos) {
        // Iterate through submitted product quantities
        for (ProductosEntidades producto : productos) {
            int nuevaCantidad = producto.getNuevaCantidad();
            int cantidad = producto.getCantidad();
            int cantidadActualizada = cantidad-nuevaCantidad;
            producto.setCantidad(cantidadActualizada);

        }
        return "redirect:/lista_productos";
    }

    @GetMapping("/productos/nuevo")
    public String guardarProducto(Model modelo){
        ProductosEntidades producto = new ProductosEntidades();
        producto.setNuevaCantidad(0);
        modelo.addAttribute("productorellenar",producto);
        return "Nuevo_Producto";
    }
    @PostMapping({"/accioncrear"})
    public String accioncrear(@ModelAttribute("productorellenar") ProductosEntidades producto){
        this.productoOperaciones.crear(producto);
        return "redirect:/productos";
    }

    @GetMapping({"/productos","/"})
    public String listarProductos(Model modelo) {
        modelo.addAttribute("productos", productoOperaciones.consultar());
        return "lista_productos";
    }


}