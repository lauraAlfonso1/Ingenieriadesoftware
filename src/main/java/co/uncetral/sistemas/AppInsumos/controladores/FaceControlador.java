package co.uncetral.sistemas.AppInsumos.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FaceControlador {

@GetMapping("/Face")
    public String mostrarInterface() {
        return "Face"; // Devuelve el nombre de la página HTML
    }
}

