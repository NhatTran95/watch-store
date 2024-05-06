package org.example.shoppingmallspb.service;

import org.example.shoppingmallspb.domain.Image;
import org.example.shoppingmallspb.domain.dto.request.ImageRequestDTO;
import org.example.shoppingmallspb.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public Image createImage(ImageRequestDTO imageRequestDTO) {
        var image = new Image(imageRequestDTO.getUrl());
        imageRepository.save(image);

        return image;
    }
}
