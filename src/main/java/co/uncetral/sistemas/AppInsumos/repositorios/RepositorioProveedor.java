package co.uncetral.sistemas.AppInsumos.repositorios;

import co.uncetral.sistemas.AppInsumos.entidades.ProovedoresEntidades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProveedor extends JpaRepository<ProovedoresEntidades, Long> {
}
