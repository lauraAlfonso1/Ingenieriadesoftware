package co.uncetral.sistemas.AppInsumos.operaciones;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import java.util.List;

public interface ProductoCodOperaciones {
    List<ProductosEntidades> consultarc();
    List<ProductosEntidades> consultarPorCodigo(Long codigo);
}