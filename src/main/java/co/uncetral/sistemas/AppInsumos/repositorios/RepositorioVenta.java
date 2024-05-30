package co.uncetral.sistemas.AppInsumos.repositorios;
import co.uncetral.sistemas.AppInsumos.entidades.VentasEntidades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioVenta extends JpaRepository<VentasEntidades, Long> {
}