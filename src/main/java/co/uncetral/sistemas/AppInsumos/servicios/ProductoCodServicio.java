package co.uncetral.sistemas.AppInsumos.servicios;
import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProductoCodOperaciones;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProductoCod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoCodServicio implements ProductoCodOperaciones {

    @Autowired
    RepositorioProductoCod repositorioProductoCod;

    @Override
    public List<ProductosEntidades> consultarc() {
        return repositorioProductoCod.findAll();
    }

    @Override
    public List<ProductosEntidades> consultarPorCodigo(Long codigo) {
        return repositorioProductoCod.findByCodigo(codigo);
    }
}

