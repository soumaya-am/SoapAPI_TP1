package com.soap.soap_server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class SoapServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapServerApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            Stream.of("Table","CLoset","Chair").forEach(name ->{
                Product product =new Product();
                product.setCode(null);
                product.setName(name);
                product.setDateCreation(new Date());
                product.setPrice(110.22);
                productRepository.save(product);
            });
        };
}
}

