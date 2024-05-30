package co.uncetral.sistemas.AppInsumos.operaciones;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.entidades.VentasEntidades;
import java.util.List;
public interface VentaProductoOperaciones {

    VentasEntidades registrarVenta(List<ProductosEntidades> productosVendidos);
}

