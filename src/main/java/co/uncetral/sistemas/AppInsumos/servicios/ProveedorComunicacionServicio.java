package co.uncetral.sistemas.AppInsumos.servicios;

import co.uncetral.sistemas.AppInsumos.entidades.ProovedoresEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProveedorComunicacionOperaciones;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProveedorComunicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProveedorComunicacionServicio implements ProveedorComunicacionOperaciones {

    @Autowired
    RepositorioProveedorComunicacion repositorioProveedorComunicacion;

    @Override
    public List<ProovedoresEntidades> consultarproveedor() {
        return repositorioProveedorComunicacion.findAll();
    }
}

