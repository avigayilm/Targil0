package entities;

import java.util.Objects;

public class CommissionEmployee extends Employee{
    private int commission;
    private float grossSales;

    public CommissionEmployee(String firstName, String lastName, int id, int commission, float grossSales) {
        super(firstName, lastName, id);
        this.commission = commission;
        this.grossSales = grossSales;
    }

    public CommissionEmployee(int commission, float grossSales) {
        this.commission = commission;
        this.grossSales = grossSales;
    }

    public CommissionEmployee() {
    }

    public int getCommission() {
        return commission;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "commission=" + commission +
                ", grossSales=" + grossSales +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return commission == that.commission && Float.compare(that.grossSales, grossSales) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), commission, grossSales);
    }

    public void setCommission(int commission) {
        if(commission <= 0)
            throw new RuntimeException("please enter positive number\n");
        this.commission = commission;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if(grossSales <= 0)
            throw new RuntimeException("please enter positive number\n");
        this.grossSales = grossSales;
    }

    @Override
    public float earnings() {
        return commission * grossSales / 100;
    }
}
