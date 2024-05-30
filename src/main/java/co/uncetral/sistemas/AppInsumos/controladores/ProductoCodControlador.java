package co.uncetral.sistemas.AppInsumos.controladores;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProductoCodOperaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class ProductoCodControlador {
    @Autowired
    ProductoCodOperaciones productoCodOperaciones;

    @GetMapping("/productosCodigo")
    public String buscarProductoPorCodigo(@RequestParam(value = "codigo", required = false) Long codigo, Model modelo) {
        List<ProductosEntidades> productos;
        if (codigo != null) {
            productos = productoCodOperaciones.consultarPorCodigo(codigo);
        } else {
            productos = productoCodOperaciones.consultarc();
        }
        modelo.addAttribute("productos", productos);
        return "lista_productocod";
    }
}
