package org.example.shoppingmallspb.restController;

import org.example.shoppingmallspb.domain.dto.request.CustomerRequestDTO;
import org.example.shoppingmallspb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        return new ResponseEntity<>(customerService.createCustomer(customerRequestDTO), HttpStatus.OK);
    }
}
