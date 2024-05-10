package co.uncetral.sistemas.AppInsumos.servicios;
import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.entidades.ProovedoresEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProductoOperaciones;
import co.uncetral.sistemas.AppInsumos.operaciones.ProveedorOperaciones;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProductos;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProveedorServicio implements ProveedorOperaciones {
    @Autowired
    RepositorioProveedor repositorioProveedor;

    @Override
    public ProovedoresEntidades crearpro(ProovedoresEntidades proveedor) {
        return repositorioProveedor.save(proveedor);
    }

    @Override
    public List<ProovedoresEntidades> consultarpro() {
        return repositorioProveedor.findAll();
    }
}
