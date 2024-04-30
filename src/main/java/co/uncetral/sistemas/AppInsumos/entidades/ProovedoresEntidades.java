package co.uncetral.sistemas.AppInsumos.entidades;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Proovedor")
@Table(name = "Proovedores")
public class ProovedoresEntidades {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PROOVEDORES")
    @SequenceGenerator(name = "SEQ_PROOVEDORES_REL",sequenceName = "SEQ_PROOVEDORESRES_REL", allocationSize = 1)
    @Column(name = "Prov_NIT", nullable = false)
    private int nit;

    @Column(name = "Prov_Nombre", nullable = false)
    private String nombre;

    @Column(name = "Prov_contacto", nullable = false)
    private int contacto;

    @Column(name = "Prov_Direccion", nullable = false)
    private String direccion;
}
