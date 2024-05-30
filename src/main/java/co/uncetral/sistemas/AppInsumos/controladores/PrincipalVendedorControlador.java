package co.uncetral.sistemas.AppInsumos.controladores;


import co.uncetral.sistemas.AppInsumos.entidades.VendedoresEntidades;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalVendedorControlador {

    @GetMapping("/PrincipalVendedor")
    public String mostrarPrincipalVendedor(HttpSession session, Model modelo) {
        VendedoresEntidades vendedor = (VendedoresEntidades) session.getAttribute("vendedor");
        if (vendedor == null) {
            return "redirect:/login_vendedor";  // Redirige al login si no hay un vendedor en la sesión
        }
        modelo.addAttribute("vendedor", vendedor);
        return "PrincipalVendedor";  // Muestra la página principal del vendedor
    }
}