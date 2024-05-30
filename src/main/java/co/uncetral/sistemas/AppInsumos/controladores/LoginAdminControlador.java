package co.uncetral.sistemas.AppInsumos.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginAdminControlador {

    @GetMapping("/login_admin")
    public String mostrarLoginAdmin() {
        return "login_admin";
    }

    @PostMapping("/login_admin")
    public String procesarLoginAdmin(@RequestParam String email, @RequestParam String password) {
        // Lógica de autenticación para el administrador
        if ("admin@ejemplo.com".equals(email) && "admin123".equals(password)) {
            return "redirect:/PrincipalAdmin";
        }
        return "login_admin";
    }

    @GetMapping("/PrincipalAdmin")
    public String mostrarDashboardAdmin() {
        return "PrincipalAdmin";
    }
}
