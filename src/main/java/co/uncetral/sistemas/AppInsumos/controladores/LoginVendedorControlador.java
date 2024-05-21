package co.uncetral.sistemas.AppInsumos.controladores;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginVendedorControlador {

    @GetMapping("/login_vendedor")
    public String mostrarLoginVendedor() {
        return "login_vendedor";
    }

    @PostMapping("/login_vendedor")
    public String procesarLoginVendedor(@RequestParam String email, @RequestParam String password) {
        // Lógica de autenticación para el vendedor
        if ("vendedor@ejemplo.com".equals(email) && "password123".equals(password)) {
            return "redirect:/dashboard_vendedor";
        }
        return "login_vendedor";
    }
}
