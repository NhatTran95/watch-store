package org.example.shoppingmallspb.repository;

import org.example.shoppingmallspb.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
