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
    @Column(name = "Clien_ID", nullable = false)
    private int id;

    @Column(name = "Clien_Nombre", nullable = false)
    private String nombre;

    @Column(name = "Clien_Correo",nullable = false)
    private String correo;



}
