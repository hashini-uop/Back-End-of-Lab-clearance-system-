package com.system.labClearanceSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LabAdmin")
@Inheritance(strategy = InheritanceType.JOINED)
public class LabAdmin {
    @Id
    @Column(name = "a_id")
    private int a_id;
    @Column(name = "a_firsName")
    private String a_firstName;
    @Column(name = "a_lastName")
    private String a_lastName;
    @Column(name = "a_lab")
    private String a_lab;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lab_id" , nullable = false , unique = true)

    private Lab lab;




}
