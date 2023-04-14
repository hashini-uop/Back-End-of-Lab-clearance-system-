package com.system.labClearanceSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "s_regNo" , nullable = false , length = 10)
    private String s_regNo;
    @Column(name = "s_fName" ,  nullable = false , length = 10)
    private String s_fName;
    @Column(name = "s_lName" ,  nullable = false , length = 10)
    private String s_lName;
    @Column(name = "s_mobile" , nullable = false , length = 10)
    private int s_mobile;
    @Column(name = "s_year" , nullable = false , length = 10)
    private int s_year;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "student_lab",
            joinColumns = @JoinColumn(name = "s_regNo"),
            inverseJoinColumns = @JoinColumn(name = "l_id"))
        @JsonIgnore
        private Set<Lab> labs = new HashSet<>();


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "borrow",
            joinColumns = @JoinColumn(name = "s_regNo"),
            inverseJoinColumns = @JoinColumn(name = "e_id"))
    @JsonIgnore
    private Set<Equipment> equipments = new HashSet<>();


    @OneToOne(mappedBy = "student")
    private Payment payment;





}



