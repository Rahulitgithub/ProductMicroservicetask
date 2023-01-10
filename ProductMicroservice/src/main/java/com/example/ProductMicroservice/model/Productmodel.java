package com.example.ProductMicroservice.model;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Productdatabase")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Productmodel {
    private int productId;
    private int productname;
    private int productquantity;
    private int productprice;


}
