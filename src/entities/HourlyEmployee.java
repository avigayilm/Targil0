package entities;


import java.util.Objects;

public class HourlyEmployee extends Employee{
    private  int hours;
    private  float wages;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wages) {
        super(firstName, lastName, id);
        this.hours = hours;
        this.wages = wages;
    }

    public HourlyEmployee(int hours, float wages) {
        this.hours = hours;
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours <= 0)
            throw new RuntimeException("please enter positive number\n");
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return hours == that.hours && Float.compare(that.wages, wages) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wages);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", wages=" + wages +
                '}';
    }

    public void setWages(float wages) {
        if(wages <= 0)
            throw new RuntimeException("please enter positive number\n");
        this.wages = wages;
    }

    public float getWages() {
        return wages;
    }

    public HourlyEmployee() {
        super();
        this.hours= 0;
        this.wages = 0;
    }

    @Override
    public float earnings() {
        return hours*wages;
    }
}
