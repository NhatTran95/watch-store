package org.example.shoppingmallspb.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillDetailReqDTO {
    private String quantity;
    private String amount;
    private String idProduct;
}
