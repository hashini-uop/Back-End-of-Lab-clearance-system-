package com.system.labClearanceSystem.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Bank")
public class Bank {


    @Id
    @Column(name = "b_id")
    @Nonnull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int b_id;
    @Column(name = "branch_code" , length = 4 , nullable = false)
    @Nonnull
    private  int branch_code;


    @Column(name = "bank_code" , length = 4 , nullable = false)
    private  int bank_code;
    @Column(name = "b_name" , length = 10 , nullable = false)
    @Nonnull
    private String b_name;
    @Column(name = "b_loc" , length = 5 , nullable = false)
    private String b_loc;
    @Column(name = "branch" , length = 8 , nullable = false)
    private String branch;
    @Column(name = "b_address" ,  length = 20 , nullable = false)
    private String b_address;

    @Column(name = "b_tpNumber" , length = 10 , nullable = false)
    private String b_tpNumber;


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bank")
//    @JsonIgnore
//    private Set<Payment> payments;




    public Bank() {
    }

    public int getBank_code() {
        return bank_code;
    }

    public void setBank_code(int bank_code) {
        this.bank_code = bank_code;
    }

    public int getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(int branch_code) {
        this.branch_code = branch_code;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_loc() {
        return b_loc;
    }

    public void setB_loc(String b_loc) {
        this.b_loc = b_loc;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getB_address() {
        return b_address;
    }

    public void setB_address(String b_address) {
        this.b_address = b_address;
    }

    public String getB_tpNumber() {
        return b_tpNumber;
    }

    public void setB_tpNumber(String b_tpNumber) {
        this.b_tpNumber = b_tpNumber;
    }
}
