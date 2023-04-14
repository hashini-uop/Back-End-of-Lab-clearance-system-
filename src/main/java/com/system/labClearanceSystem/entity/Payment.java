package com.system.labClearanceSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Payment")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id", length = 10, nullable = false)
    private int p_id;

    @Column(name = "user_regNo" , length = 20, nullable = false)
    private String user_regNo;




    @Column(name = "user_lab", length = 10, nullable = false)
    private String user_lab;

    @Column(name = "equipment_name", length = 20, nullable = false)
    private String equipment_name;

    @Column(name = "quantity", length = 10, nullable = false)
    private int quantity;

    @Column(name = "equipment_price", length = 5, nullable = false)
    private int equipment_price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_regNo", referencedColumnName = "s_regNo")
    @JsonIgnore
    private Student student;





}


