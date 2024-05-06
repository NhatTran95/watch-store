package org.example.shoppingmallspb.repository;

import org.example.shoppingmallspb.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
