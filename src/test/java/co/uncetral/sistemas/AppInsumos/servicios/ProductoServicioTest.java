package co.uncetral.sistemas.AppInsumos.servicios;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProductos;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;



@RunWith(MockitoJUnitRunner.class)
class ProductoServicioTest {
    @InjectMocks
    private ProductoServicio productoServicio;

    @Mock
    private RepositorioProductos repositorioProductos;


    @Test
    void crear() {
        ProductosEntidades producto = ProductosEntidades
                .builder()
                .codigo(123)
                .nombre("Motor")
                .modelo("2024-HS")
                .descripcion("Azul")
                .cantidad(5)
                .precio(50000)
                .build();
        when(repositorioProductos.save(producto)).thenReturn(producto);


        ProductosEntidades resultado = productoServicio.crear(producto);


        verify(repositorioProductos).save(producto);


        assertEquals(producto, resultado);
    }

    @Test
    void consultar() {

        given(repositorioProductos.findAll()).willReturn(Collections.emptyList());

        List<ProductosEntidades> productos = productoServicio.consultar();


        assertThat(productos).isEmpty();
        assertThat(productos.size()).isZero();

    }

    @Test
    void actualizarInventario() {
    }
}