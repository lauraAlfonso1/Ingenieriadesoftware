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

@Controller
public class ProductoControladores {
    @Autowired
    ProductoOperaciones productoOperaciones;

    @GetMapping("/nuevoproduc")
    public String guardarProducto(Model modelo) {
        ProductosEntidades producto = new ProductosEntidades();
        modelo.addAttribute("productorellenar", producto);
        return "Nuevo_Producto";
    }

    @PostMapping("/accioncrear")
    public String accioncrear(@ModelAttribute("productorellenar") ProductosEntidades producto) {
        productoOperaciones.crear(producto);
        return "redirect:/nuevoproduc";
    }
}
