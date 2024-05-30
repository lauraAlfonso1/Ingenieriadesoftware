package co.uncetral.sistemas.AppInsumos.entidades;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Proveedor")
@Table(name = "Proveedores")
public class ProovedoresEntidades {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PROOVEDORE")
    @SequenceGenerator(name = "SEQ_PROOVEDORES_REL",sequenceName = "SEQ_PROOVEDORESRES_REL", allocationSize = 1)
    @Column(name = "Prov_NIT", nullable = false)
    private int NIT;

    @Column(name = "Prov_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "Prov_CONTACTO", nullable = false)
    private int contacto;

    @Column(name = "Prov_DIRECCION", nullable = false)
    private String direccion;
    @Column(name = "Prov_PRODUCTOSSUMINISTRADOS", nullable = false)
    private String productosSuministrados;
}
