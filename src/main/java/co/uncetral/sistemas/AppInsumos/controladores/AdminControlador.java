package co.uncetral.sistemas.AppInsumos.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminControlador {

    @GetMapping("/Nuevo_Proveedor")
    public String registrarProveedores() {
        return "Nuevo_Proveedor";  // Redirige a la página de registro de proveedores
    }

    @GetMapping("/Nuevo_Cliente")
    public String registrarClientes() {
        return "Nuevo_Cliente";
    }
}
