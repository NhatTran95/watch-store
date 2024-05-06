package org.example.shoppingmallspb.service;

import org.example.shoppingmallspb.domain.Brand;
import org.example.shoppingmallspb.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }
}
