package org.example.shoppingmallspb.repository;

import org.example.shoppingmallspb.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
