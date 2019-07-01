package com.shoppingcart.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.shoppingcart.demo.model.Product;
import com.shoppingcart.demo.service.ProductService;

@SpringBootApplication

public class ShoppingCartSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartSpringBootAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductService productService) {
		return args -> {
			productService.save(new Product(1L, "TV Set", 300.00, "http://uhfnocturne.com/wp-content/uploads/2017/09/aj.jpg"));
			productService.save(new Product(2L, "Game Console", 200.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWuxnRzKBxvYij-dFDcN_Iukub3cMLZ8BaYFDn3FdoQhe1bzn2OQ"));
			productService.save(new Product(3L, "Sofa", 100.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT69jwGxxDVqH051qPD52ETRdsUehfk42OxzpknOL4VztIn4K6d"));
			productService.save(new Product(4L, "Icecream", 5.00, "https://images.pexels.com/photos/1362534/pexels-photo-1362534.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
			productService.save(new Product(5L, "Beer", 3.00, "https://www.ultraliquors.co.za/images/cooldrinks/beer-at-ultraliquors.jpg"));
			productService.save(new Product(6L, "Phone", 500.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-SoYatNte-P5rgz9qyFTSCM2t0RBIrLrmWckENY5f3_GKher4"));
			productService.save(new Product(7L, "Watch", 30.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzF66AY63iQHD83VlPoGGFnuL0LYFdXqFrS_t_KLFC0ipjYJGCRg"));
		};
	}
}
