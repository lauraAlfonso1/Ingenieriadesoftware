package co.uncetral.sistemas.AppInsumos.entidades;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Cliente")
@Table(name = "Clientes")


public class ClientesEntidades {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTES_REL")
    @SequenceGenerator(name = "SEQ_CLIENTES_REL", sequenceName = "SEQ_CLIENTE_REL",allocationSize = 1)
    @Column(name = "Clien_NIT", nullable = false)
    private int nit;

    @Column(name = "Clien_Nombre", nullable = false)
    private String nombre;

    @Column(name = "Clien_Correo",nullable = false)
    private String correo;



}
