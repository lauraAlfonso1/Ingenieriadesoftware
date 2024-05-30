package co.uncetral.sistemas.AppInsumos.controladores;
import co.uncetral.sistemas.AppInsumos.entidades.VendedoresEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.VendedorOperaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class VendedorControlador {

    @Autowired
    VendedorOperaciones vendedorOperaciones;
    @GetMapping("Vendedores/nuevoVendedor")
    public String  guadarvendedor(Model modelo){

        VendedoresEntidades vendedor = new VendedoresEntidades();
        modelo.addAttribute("vendedorllenar",vendedor);
        return "Nuevo_vendedor";

    }
    @PostMapping ({"accioncrearven"})
    public String accioncrearven (@ModelAttribute("vendedorllenar")VendedoresEntidades vendedor){
        this.vendedorOperaciones.crearven(vendedor);
        return  "redirect:/Vendedores";
    }

    @GetMapping({"/Vendedores","/"})
    public  String listarvnedores (Model modelo){
        modelo.addAttribute("Vendedores", vendedorOperaciones.consultarven());
        return "Lista_vendedores";
    }
}
