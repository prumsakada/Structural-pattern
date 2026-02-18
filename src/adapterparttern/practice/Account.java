package adapterparttern.practice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {
    private Integer id;
    private double balance;
    private Integer accNumber;
    private String accName;
    private LocalDate createDate;

    public Account(Integer id, double balance, Integer accNumber, LocalDate createDate , String accName) {
        this.id = id;
        this.balance = balance;
        this.accNumber = accNumber;
        this.createDate = createDate;
        this.accName = accName;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
