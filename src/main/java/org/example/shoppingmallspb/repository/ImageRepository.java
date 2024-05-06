package org.example.shoppingmallspb.repository;

import org.example.shoppingmallspb.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
