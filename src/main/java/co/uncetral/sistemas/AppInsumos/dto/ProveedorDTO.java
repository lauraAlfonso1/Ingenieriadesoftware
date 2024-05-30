package co.uncetral.sistemas.AppInsumos.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class ProveedorDTO {
    private int NIT;
    private String Nombre;
    private int Contacto;
    private String Direccion;
    private String PorductosSuministrados;
}
