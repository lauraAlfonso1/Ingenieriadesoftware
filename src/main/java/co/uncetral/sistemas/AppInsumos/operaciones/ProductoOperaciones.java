package co.uncetral.sistemas.AppInsumos.operaciones;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;

import java.util.List;

public interface ProductoOperaciones {
    public ProductosEntidades crear (ProductosEntidades producto);
    public List <ProductosEntidades> consultar();

    void actualizarCantidad(long productoId, int nuevaCantidad);
}
