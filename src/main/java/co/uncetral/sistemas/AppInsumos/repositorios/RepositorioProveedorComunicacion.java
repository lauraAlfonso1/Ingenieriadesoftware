package co.uncetral.sistemas.AppInsumos.repositorios;

import co.uncetral.sistemas.AppInsumos.entidades.ProovedoresEntidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProveedorComunicacion  extends JpaRepository<ProovedoresEntidades, Integer> {
}
