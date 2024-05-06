package org.example.shoppingmallspb.restController;

import org.example.shoppingmallspb.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brands")
public class BrandRestController {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public ResponseEntity<?> getAllBrands() {
        return new ResponseEntity<>(brandService.getAll(), HttpStatus.OK);
    }
}
