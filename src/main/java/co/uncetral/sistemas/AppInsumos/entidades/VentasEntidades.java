package co.uncetral.sistemas.AppInsumos.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Venta")
@Table(name = "Ventas")
public class VentasEntidades implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VENTA_ID", nullable = false)
    private Long id;

    @Column(name = "VENTA_TOTAL", nullable = false)
    private double total;

    @Column(name = "VENTA_DESCUENTO", nullable = false)
    private double descuento;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "VENTA_ID")
    private List<ProductosEntidades> productos;
}
