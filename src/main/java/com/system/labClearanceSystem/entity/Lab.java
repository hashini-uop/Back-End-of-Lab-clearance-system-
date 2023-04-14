package com.system.labClearanceSystem.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Lab")
@Inheritance(strategy = InheritanceType.JOINED)
public class Lab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "l_id")
    private int l_id;

    @Column(name = "code")
    private String code;
    @Column(name = "l_name")
    private String l_name;

    @Column(name = "l_category")
    private String l_category;


    @Column(name = "l_type")
    private String l_type;
    @Column(name = "l_location")
    private String l_location;
    @Column(name = "l_num")
    private String l_num;






}
