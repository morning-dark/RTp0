package org.suptech.tp0.entities;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Product {
    private String ref ;
    private String label;
    private double price ;
    private int quantity;
}
