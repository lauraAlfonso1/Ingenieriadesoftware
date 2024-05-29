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
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_VENDEDORES")
    @SequenceGenerator(name = "SEQ_VENDEDORES_REL",sequenceName = "SEQ_VENDEDORES_REL", allocationSize = 1)
    @Column(name = "Vend_ID", nullable = false)
    private int id;

    @Column(name = "Vend_Nombre", nullable = false)
    private String nombre;

    @Column(name = "Vend_Contacto", nullable = false)
    private int numero;

}
