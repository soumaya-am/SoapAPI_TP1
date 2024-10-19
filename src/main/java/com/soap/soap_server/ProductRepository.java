package com.soap.soap_server;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product deleteProductByCode(Long code);

    Product findProductByCode(Long code);
}
