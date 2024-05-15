package co.uncetral.sistemas.AppInsumos.servicios;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.operaciones.ProductoOperaciones;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServicio implements ProductoOperaciones {
    @Autowired
    RepositorioProductos repositorioProductos;

    @Override
    public ProductosEntidades crear(ProductosEntidades producto) {
        return repositorioProductos.save(producto);
    }


    @Override
    public List<ProductosEntidades> consultar() {
        return repositorioProductos.findAll();
    }

    @Override
    public ProductosEntidades restar(int cantidades) {
        //@Query

        return null;
    }
}
