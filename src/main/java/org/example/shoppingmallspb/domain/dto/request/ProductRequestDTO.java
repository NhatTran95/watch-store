package org.example.shoppingmallspb.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDTO {
    private String title;

    private String price;

    private String description;

    private String discountPercentage;

    private String rating;

    private String stock;

    private String brandId;

    private String categoryId;

    private List<String> imageIds;
}
