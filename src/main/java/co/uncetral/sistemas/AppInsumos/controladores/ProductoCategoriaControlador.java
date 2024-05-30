package co.uncetral.sistemas.AppInsumos.controladores;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProductoOperaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ProductoCategoriaControlador {
    @Autowired
    ProductoOperaciones productoOperaciones;

    @GetMapping("/productoCategoria")
    public String listarProductosPorCategoria(@RequestParam(value = "categoria", required = false) String categoria, Model modelo) {
        List<ProductosEntidades> productos;

        if (categoria != null && !categoria.isEmpty()) {
            productos = productoOperaciones.consultarPorCategoria(categoria);
        } else {
            productos = productoOperaciones.consultar();
        }

        modelo.addAttribute("productos", productos);
        return "lista_productosCategoria";
    }
}

