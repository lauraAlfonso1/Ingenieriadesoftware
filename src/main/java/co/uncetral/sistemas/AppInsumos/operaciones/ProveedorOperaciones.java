package co.uncetral.sistemas.AppInsumos.operaciones;

import co.uncetral.sistemas.AppInsumos.entidades.ProovedoresEntidades;

import java.util.List;

public interface ProveedorOperaciones {

    public ProovedoresEntidades crearpro (ProovedoresEntidades proveedor);
    public List<ProovedoresEntidades> consultarpro();

}
