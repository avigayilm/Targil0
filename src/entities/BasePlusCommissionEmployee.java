package entities;

import java.util.Objects;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private float baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, int commission, float grossSales, float baseSalary) {
        super(firstName, lastName, id, commission, grossSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(that.baseSalary, baseSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary);
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary<= 0)
            throw new RuntimeException("please enter positive number\n");
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public float earnings() {
        return baseSalary + super.earnings();
    }
}


