package co.uncetral.sistemas.AppInsumos;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class AppInsumosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppInsumosApplication.class, args);
	}



}
