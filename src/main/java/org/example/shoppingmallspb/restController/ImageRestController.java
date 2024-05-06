package org.example.shoppingmallspb.restController;

import org.example.shoppingmallspb.domain.dto.request.ImageRequestDTO;
import org.example.shoppingmallspb.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/images")
public class ImageRestController {
    @Autowired
    private ImageService imageService;

    @PostMapping
    public ResponseEntity<?> createImage(@RequestBody ImageRequestDTO imageRequestDTO) {
        return new ResponseEntity<>(imageService.createImage(imageRequestDTO), HttpStatus.OK);
    }
}
