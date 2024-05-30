package co.uncetral.sistemas.AppInsumos.controladores;

import co.uncetral.sistemas.AppInsumos.entidades.ClientesEntidades;
import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ClienteOperaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteControladores {
    @Autowired
    ClienteOperaciones clienteOperaciones;
    @GetMapping("clientes/nuevo")
    public String guardarCliente(Model modelo){
        ClientesEntidades cliente = new ClientesEntidades();
        modelo.addAttribute("clienterellenar",cliente);
        return "Nuevo_Cliente";
    }
    @PostMapping({"/clientesCrear"})
    public String accioncrear(@ModelAttribute("clienterellenar") ClientesEntidades cliente){
        this.clienteOperaciones.crear(cliente);
        return "redirect:/clientes";
    }
    @GetMapping({"/clientes"})
    public String listarProductos(Model modelo) {
        modelo.addAttribute("clientes", clienteOperaciones.consultar());
        return "lista_clientes";

    }
}
