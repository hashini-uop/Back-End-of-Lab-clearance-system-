package com.system.labClearanceSystem.entity;

import java.io.Serializable;
import java.util.Objects;

public class BankID implements Serializable {
    private int branch_code;
    private int bank_code;

    public BankID() {
    }

    public int getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(int branch_code) {
        this.branch_code = branch_code;
    }

    public int getBank_code() {
        return bank_code;
    }

    public void setBank_code(int bank_code) {
        this.bank_code = bank_code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankID bankID = (BankID) o;
        return branch_code == bankID.branch_code && bank_code == bankID.bank_code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch_code, bank_code);
    }
}
