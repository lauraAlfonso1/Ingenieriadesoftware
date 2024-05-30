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
    public String listarProductosPorNombre(@RequestParam(value = "nombre", required = false) String nombre, Model modelo) {
        List<ProductosEntidades> productos;

        if (nombre != null && !nombre.isEmpty()) {
            productos = productoOperaciones.consultarPorNombre(nombre);
        } else {
            productos = productoOperaciones.consultar();
        }

        modelo.addAttribute("productos", productos);
        return "lista_productos";
    }
}