package co.uncetral.sistemas.AppInsumos.repositorios;

import co.uncetral.sistemas.AppInsumos.entidades.ClientesEntidades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<ClientesEntidades,Integer> {
}
