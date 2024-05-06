package org.example.shoppingmallspb.repository;

import org.example.shoppingmallspb.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
