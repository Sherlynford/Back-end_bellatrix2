package com.example.backend_app.model;

import java.time.Instant;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue
    private Long transactionId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "product_account_id", referencedColumnName = "accountId")
    private ProductAccount productAccount;

    private Double price;

    private Instant time;

    private String status;
    
    private Integer amount;
}
