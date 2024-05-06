package org.example.shoppingmallspb.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.shoppingmallspb.domain.enums.EGender;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String title;

    private BigDecimal price;

    private String description;

    private Double discountPercentage;

    private Double rating;

    private BigDecimal stock;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Image> images;

    @Enumerated(EnumType.STRING)
    private EGender gender;

}
