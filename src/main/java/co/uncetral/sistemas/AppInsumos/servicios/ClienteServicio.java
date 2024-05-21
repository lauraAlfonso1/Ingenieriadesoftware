package co.uncetral.sistemas.AppInsumos.servicios;

import co.uncetral.sistemas.AppInsumos.entidades.ClientesEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ClienteOperaciones;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio implements ClienteOperaciones {
    @Autowired
    RepositorioCliente repositorioCliente;

    @Override
    public ClientesEntidades crear(ClientesEntidades cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public List<ClientesEntidades> consultar() {
        return repositorioCliente.findAll();

    }

}
