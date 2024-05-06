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
public class BillReqDTO {
    private String total;
    private String orderDate;
    private List<BillDetailReqDTO> billDetails;
    private CustomerRequestDTO customerInfo;
}
