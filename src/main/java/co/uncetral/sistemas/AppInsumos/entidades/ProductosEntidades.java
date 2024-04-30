package co.uncetral.sistemas.AppInsumos.entidades;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;


import java.io.Serializable;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Producto")
@Table(name= "Productos")
public class ProductosEntidades {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCTOS")
    @SequenceGenerator(name = "SEQ_PRODUCTOS",sequenceName = "SEQ_PRODUCTOS", allocationSize = 1)
    @Column(name = "PROD_CODIGO")
    private long codigo;

    @Column(name = "PROD_MARCA")
    private String nombre;

    @Column(name = "PROD_MODELO")
    private String modelo;

    @Column(name = "PRO_DESCRIPCION")
    private String descripcion;

    @Column(name = "PROD_CANTIDAD")
    private int cantidad;





}
