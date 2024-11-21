package com.devops.product_service_api_2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document( collation = "products" )
// relational -> Table, Data raw | non-relational -> Collection, Document
public class Product {
    @Id
    private String id;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}
