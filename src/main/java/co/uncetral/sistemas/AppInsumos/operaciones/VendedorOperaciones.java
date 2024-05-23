package co.uncetral.sistemas.AppInsumos.operaciones;


import co.uncetral.sistemas.AppInsumos.entidades.VendedoresEntidades;

import java.util.List;

public interface VendedorOperaciones {
    public VendedoresEntidades crearven (VendedoresEntidades vendedor);
    public List<VendedoresEntidades> consultarven();

}
