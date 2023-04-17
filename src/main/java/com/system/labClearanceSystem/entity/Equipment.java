package com.system.labClearanceSystem.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "Equipment")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int e_id;

    @Column(name = "name")
    private String name;
    @Column(name = "e_price")
    private int e_price;
    @Column(name = "quantity")
    private int quantity;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "lab_id", nullable = false, unique = true)
//
//    private Lab labs;
}









