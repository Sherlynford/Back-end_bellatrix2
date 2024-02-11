package com.example.backend_app.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    private String type;
    private String picture;
    private String unit;
    private String description;
    private Integer amount;
    private Double buying_price;
    private Double selling_price;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<ProductAccount> productAccounts;
    
}
