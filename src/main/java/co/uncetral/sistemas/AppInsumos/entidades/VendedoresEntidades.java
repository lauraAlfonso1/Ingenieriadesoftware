package co.uncetral.sistemas.AppInsumos.entidades;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Vendedor")
@Table(name = "Vendedores")
@ToString
public class VendedoresEntidades implements Serializable {
    @Id
    @Column(name = "VEND_CEDULA", nullable = false)
    private int cedula;

    @Column(name = "VEND_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "VEND_CONTACTO", nullable = false)
    private int numero;

    @Column(name = "VEND_CORREO", nullable = false, unique = true)
    private String correo;

    @Column(name = "VEND_CONTRA", nullable = false)
    private String contrasena;




}
