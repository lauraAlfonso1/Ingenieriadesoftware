package co.uncetral.sistemas.AppInsumos.repositorios;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepositorioProductoCod extends JpaRepository<ProductosEntidades, Long> {
    List<ProductosEntidades> findByCodigo(Long codigo);
}
