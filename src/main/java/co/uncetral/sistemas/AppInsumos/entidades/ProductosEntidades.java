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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CODIGO_REL")
    @SequenceGenerator(name = "SEQ_CODIGO_REL",sequenceName = "SEQ_CODIGO_REL",allocationSize = 1)
    @Column(name = "PROD_CODIGO", nullable = false)
    private long codigo;

    @Column(name = "PROD_MARCA", nullable = false)
    private String nombre;

    @Column(name = "PROD_MODELO", nullable = false)
    private String modelo;

    @Column(name = "PRO_DESCRIPCION", nullable = false)
    private String descripcion;

    @Column(name = "PROD_CANTIDAD", nullable = false)
    private int cantidad;

    @Column(name = "PROD_PRECIO",nullable = false)
    private int precio;

    @Column(name = "PROD_NUEVACANTIDAD",nullable = false)
    private int nuevaCantidad;

}
