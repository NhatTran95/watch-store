package org.example.shoppingmallspb.service;

import org.example.shoppingmallspb.domain.Bill;
import org.example.shoppingmallspb.domain.BillDetail;
import org.example.shoppingmallspb.domain.Customer;
import org.example.shoppingmallspb.domain.Product;
import org.example.shoppingmallspb.domain.dto.request.BillReqDTO;
import org.example.shoppingmallspb.repository.BillDetailRepository;
import org.example.shoppingmallspb.repository.BillRepository;
import org.example.shoppingmallspb.repository.CustomerRepository;
import org.example.shoppingmallspb.repository.ProductRepository;
import org.example.shoppingmallspb.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BillDetailRepository billDetailRepository;

    @Autowired
    private ProductRepository productRepository;

    public Bill createBill(BillReqDTO billReqDTO) {
        var billNew = AppUtils.mapper.map(billReqDTO, Bill.class);

        String orderDateStr = billReqDTO.getOrderDate();
        long epochMilli = Long.parseLong(orderDateStr);
        Instant instant = Instant.ofEpochMilli(epochMilli);
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        billNew.setOrderDate(localDate);

        var customerNew = AppUtils.mapper.map(billReqDTO.getCustomerInfo(), Customer.class);
        customerNew = customerRepository.save(customerNew);

        billNew.setCustomer(customerNew);

        billNew = billRepository.save(billNew);

        var billDetails = billReqDTO.getBillDetails();
        for (var billDetail : billDetails) {
            var billDetailNew = AppUtils.mapper.map(billDetail, BillDetail.class);
            billDetailNew.setBill(billNew);

            var product = productRepository.findById(billDetail.getIdProduct()).orElse(new Product());
            billDetailNew.setProduct(product);

            billDetailRepository.save(billDetailNew);
        }


        return billNew;
    }
}
