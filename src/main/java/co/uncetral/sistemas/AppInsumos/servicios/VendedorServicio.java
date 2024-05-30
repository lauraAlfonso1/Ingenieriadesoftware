package co.uncetral.sistemas.AppInsumos.servicios;

import co.uncetral.sistemas.AppInsumos.entidades.VendedoresEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.VendedorOperaciones;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorServicio implements VendedorOperaciones {
    @Autowired
    RepositorioVendedor repositorioVendedor;

    @Override
    public VendedoresEntidades crearven(VendedoresEntidades vendedor) {
        return repositorioVendedor.save(vendedor);
    }

    @Override
    public List<VendedoresEntidades> consultarven() {
        return repositorioVendedor.findAll();
    }

    public Optional<VendedoresEntidades> autenticarVendedor(String correo, String contrasena) {
        return repositorioVendedor.findByCorreoAndContrasena(correo, contrasena);


    }
}


