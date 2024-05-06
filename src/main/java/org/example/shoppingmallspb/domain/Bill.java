package org.example.shoppingmallspb.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Table(name = "bills")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bill {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private Double total;

    private LocalDate orderDate;

    @OneToOne
    private Customer customer;
}
