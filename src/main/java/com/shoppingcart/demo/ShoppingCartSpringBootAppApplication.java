package com.shoppingcart.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

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
			productService.save(new Product(4L, "Icecream", 5.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-i5i5Hmi79og3V1xHqMprhm05ZoTInYRbJPgazm0slKd9UBl4pw"));
			productService.save(new Product(5L, "Shoe", 15.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiH_zybxAk5-cCTYgodJttedRv7Y_V5Gb2qX2OqOfWIlWZQfC5"));
			productService.save(new Product(6L, "Clock", 50.00, "https://cdn.shopify.com/s/files/1/1256/7113/products/04June2019-CliMET-6_600.jpg?v=1560163205"));
			productService.save(new Product(7L, "Beer", 3.00, "https://www.ultraliquors.co.za/images/cooldrinks/beer-at-ultraliquors.jpg"));
			productService.save(new Product(8L, "Phone", 500.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-SoYatNte-P5rgz9qyFTSCM2t0RBIrLrmWckENY5f3_GKher4"));
			productService.save(new Product(9L, "Watch", 30.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzF66AY63iQHD83VlPoGGFnuL0LYFdXqFrS_t_KLFC0ipjYJGCRg"));
			
		};
	}
}
