package org.example.shoppingmallspb.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "billDetails")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double quantity;

    private Double amount;

    @ManyToOne
    private Bill bill;

    @ManyToOne
    private Product product;
}
