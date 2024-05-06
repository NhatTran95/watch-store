package org.example.shoppingmallspb.service;

import org.example.shoppingmallspb.domain.Category;
import org.example.shoppingmallspb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
