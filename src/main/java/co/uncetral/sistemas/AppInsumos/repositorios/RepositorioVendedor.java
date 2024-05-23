package co.uncetral.sistemas.AppInsumos.repositorios;
import co.uncetral.sistemas.AppInsumos.entidades.VendedoresEntidades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioVendedor extends JpaRepository<VendedoresEntidades, Long> {

}
