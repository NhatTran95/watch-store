package org.example.shoppingmallspb.service;

import org.example.shoppingmallspb.domain.Brand;
import org.example.shoppingmallspb.domain.Category;
import org.example.shoppingmallspb.domain.Product;
import org.example.shoppingmallspb.domain.dto.request.ProductRequestDTO;
import org.example.shoppingmallspb.repository.BrandRepository;
import org.example.shoppingmallspb.repository.CategoryRepository;
import org.example.shoppingmallspb.repository.ImageRepository;
import org.example.shoppingmallspb.repository.ProductRepository;
import org.example.shoppingmallspb.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ImageRepository imageRepository;


    public List<Product> getAllProducts() {
        var productList = productRepository.findAll();

        return productList;
    }

    public Product createProduct(ProductRequestDTO productRequestDTO) {
        var productNew = AppUtils.mapper.map(productRequestDTO, Product.class);
        productNew = productRepository.save(productNew);

        var brand = brandRepository.findById(Long.valueOf(productRequestDTO.getBrandId())).orElse(new Brand());
        var category = categoryRepository.findById(Long.valueOf(productRequestDTO.getCategoryId())).orElse(new Category());

        var images = imageRepository.findAllById(productRequestDTO.getImageIds());
        for (var image : images) {
            image.setProduct(productNew);
            imageRepository.save(image);
        }

        productNew.setBrand(brand);
        productNew.setCategory(category);
        productNew.setImages(images);

        productRepository.save(productNew);

        return productNew;
    }
}
