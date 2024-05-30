package co.uncetral.sistemas.AppInsumos.controladores;

import co.uncetral.sistemas.AppInsumos.entidades.ProovedoresEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProveedorComunicacionOperaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProveedorComunicacionControlador {

    @Autowired
    ProveedorComunicacionOperaciones proveedorComunicacionOperaciones;

    @GetMapping("/proveedoresComunicacion")
    public String listarProveedores(Model modelo) {
        List<ProovedoresEntidades> proveedores = proveedorComunicacionOperaciones.consultarproveedor();
        modelo.addAttribute("proveedores", proveedores);
        return "lista_proveedoresComunicacion";
    }
}