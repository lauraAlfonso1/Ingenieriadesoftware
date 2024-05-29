package co.uncetral.sistemas.AppInsumos.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {
    private int codigo;
    private String nombre;
    private String modelo;
    private String descripcion;
    private int cantidad;
}
