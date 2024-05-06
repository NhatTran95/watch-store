package org.example.shoppingmallspb.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO {
    private String fullName;
    private String address;
    private String email;
    private String mobile;
}
