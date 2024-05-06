package org.example.shoppingmallspb.service;

import org.example.shoppingmallspb.domain.Customer;
import org.example.shoppingmallspb.domain.dto.request.CustomerRequestDTO;
import org.example.shoppingmallspb.repository.CustomerRepository;
import org.example.shoppingmallspb.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(CustomerRequestDTO customerRequestDTO) {
        var customerNew = AppUtils.mapper.map(customerRequestDTO, Customer.class);
        customerNew = customerRepository.save(customerNew);
        return customerNew;
    }
}
