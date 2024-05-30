package co.uncetral.sistemas.AppInsumos.controladores;

import co.uncetral.sistemas.AppInsumos.servicios.VendedorServicio;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginVendedorControlador {

    @Autowired
    VendedorServicio vendedorServicio;

    @GetMapping("/login_vendedor")
    public String mostrarLogin(Model modelo) {
        return "login_vendedor";
    }

    @PostMapping("/login_vendedor")
    public String procesarLogin(@RequestParam("correo") String correo,
                                @RequestParam("contrasena") String contrasena,
                                HttpSession session,
                                Model modelo) {
        var vendedor = vendedorServicio.autenticarVendedor(correo, contrasena);
        if (vendedor.isPresent()) {
            session.setAttribute("vendedor", vendedor.get());
            return "redirect:/PrincipalVendedor";  // Redirige a la página principal del vendedor
        } else {
            modelo.addAttribute("error", "Correo o contraseña incorrectos");
            return "login_vendedor";  // Vuelve a mostrar la página de login con un mensaje de error
        }
    }
}
