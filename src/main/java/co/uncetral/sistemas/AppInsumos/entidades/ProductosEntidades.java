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
    @Column(name = "PROD_CODIGO", nullable = false)
    private long codigo;

    @Column(name = "PROD_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "PROD_MARCA", nullable = false)
    private String marca;

    @Column(name = "PROD_CATEGORIA", nullable = false)
    private String categoria;

    @Column(name = "PRO_DESCRIPCION", nullable = false)
    private String descripcion;

    @Column(name = "PROD_CANTIDAD", nullable = false)
    private int cantidad;

    @Column(name = "PROD_PRECIO", nullable = false)
    private int precio;






}
