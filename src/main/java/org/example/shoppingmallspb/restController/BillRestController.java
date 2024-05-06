package org.example.shoppingmallspb.restController;

import org.example.shoppingmallspb.domain.dto.request.BillReqDTO;
import org.example.shoppingmallspb.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bills")
public class BillRestController {
    @Autowired
    private BillService billService;

    @PostMapping
    public ResponseEntity<?> createBill(@RequestBody BillReqDTO billReqDTO) {
        return new ResponseEntity<>(billService.createBill(billReqDTO), HttpStatus.CREATED);
    }
}
