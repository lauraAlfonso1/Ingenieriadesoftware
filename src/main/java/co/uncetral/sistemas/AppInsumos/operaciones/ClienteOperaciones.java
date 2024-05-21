package co.uncetral.sistemas.AppInsumos.operaciones;

import co.uncetral.sistemas.AppInsumos.entidades.ClientesEntidades;

import java.util.List;

public interface ClienteOperaciones {
    public ClientesEntidades crear(ClientesEntidades cliente);
    public List <ClientesEntidades> consultar();
}
