package co.uncetral.sistemas.AppInsumos.entidades;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Producto")
@Table(name= "Productos")

public class ProductosEntidades implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROD_CODIGO", nullable = false)
    private int codigo;

    @Column(name = "PROD_MARCA", nullable = false)
    private String nombre;

    @Column(name = "PROD_MODELO", nullable = false)
    private String modelo;

    @Column(name = "PRO_DESCRIPCION", nullable = false)
    private String descripcion;

    @Column(name = "PROD_CANTIDAD", nullable = false)
    private int cantidad;





}
