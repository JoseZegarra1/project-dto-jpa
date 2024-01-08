package com.jos3zy.projectdtojpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_product")
public class Product {

    @Id
    @Column(name="id_product")
    private Long id;
    private String brand;
    private boolean expired;
    private String name;
    private float price;

    @ManyToOne
    @JoinColumn(name="id",
    referencedColumnName = "id_local")
    private Local local;

}
