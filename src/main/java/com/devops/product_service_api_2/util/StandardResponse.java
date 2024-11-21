package com.devops.product_service_api_2.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandardResponse {
    private int status;
    private String message;
    private Object object;
}
