package co.uncetral.sistemas.AppInsumos.controladores;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProductoOperaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class ProductoConsultaControlador {
    @Autowired
    ProductoOperaciones productoOperaciones;

    @GetMapping("/productos")
    public String listarProductos(@RequestParam(value = "nombre", required = false) String nombre,
                                  @RequestParam(value = "categoria", required = false) String categoria,
                                  Model modelo) {
        List<ProductosEntidades> productos;

        if (nombre != null && !nombre.isEmpty()) {
            productos = productoOperaciones.consultarPorNombre(nombre);
        } else if (categoria != null && !categoria.isEmpty()) {
            productos = productoOperaciones.consultarPorCategoria(categoria);

        } else {
            productos = productoOperaciones.consultar();
        }

        modelo.addAttribute("productos", productos);
        return "lista_productos";
    }
}

