package co.uncetral.sistemas.AppInsumos.repositorios;

import co.uncetral.sistemas.AppInsumos.entidades.VendedoresEntidades;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RepositorioVendedor extends JpaRepository<VendedoresEntidades, Long> {
    Optional<VendedoresEntidades> findByCorreoAndContrasena(String correo, String contrasena);
}
