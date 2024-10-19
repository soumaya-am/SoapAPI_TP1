package com.soap.soap_server;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Getter
@Setter
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;
    private String name;
    private Double price;
    private Date dateCreation;
}
