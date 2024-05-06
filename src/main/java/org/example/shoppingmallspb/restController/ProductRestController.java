package org.example.shoppingmallspb.restController;

import org.example.shoppingmallspb.domain.dto.request.ProductRequestDTO;
import org.example.shoppingmallspb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        return new ResponseEntity<>(productService.createProduct(productRequestDTO), HttpStatus.OK);
    }

}
