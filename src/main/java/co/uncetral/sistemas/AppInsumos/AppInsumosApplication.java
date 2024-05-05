package co.uncetral.sistemas.AppInsumos;

import co.uncetral.sistemas.AppInsumos.entidades.ProductosEntidades;
import co.uncetral.sistemas.AppInsumos.repositorios.RepositorioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class AppInsumosApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AppInsumosApplication.class, args);
	}

	@Autowired
	private RepositorioProductos repo;

	@Override
	public void run(String... args) throws Exception {
		ProductosEntidades pro1 =new ProductosEntidades(12,"p1","hy23","compuxd",4);
		repo.save(pro1);

		ProductosEntidades pro2 =new ProductosEntidades(34,"p2","lk45","celuxd",2);
		repo.save(pro2);

	}
}
