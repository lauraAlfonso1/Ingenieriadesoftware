package co.uncetral.sistemas.AppInsumos.controladores;

import co.uncetral.sistemas.AppInsumos.entidades.ProovedoresEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProveedorOperaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProveedorControlador {
    @Autowired
    ProveedorOperaciones proveedorOperaciones;
    @GetMapping("Proveedores/nuevoPro")
    public String  guardarProveedor(Model modelo){

        ProovedoresEntidades proveedor = new ProovedoresEntidades();
        modelo.addAttribute("proveedorllenar",proveedor);
        return "Nuevo_proveedor";

    }
    @PostMapping ({"accioncrearpro"})
    public String accioncrearpro (@ModelAttribute("proveedorllenar")ProovedoresEntidades proveedor){
        this.proveedorOperaciones.crearpro(proveedor);
        return  "redirect:/Proveedores";
    }

    @GetMapping({"/Proveedores","/"})
    public  String listarproveedores(Model modelo){
        modelo.addAttribute("Proveedores", proveedorOperaciones.consultarpro());
        return "Lista_Proveedores";
    }
}
