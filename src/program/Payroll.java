package program;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;
import entities.Employee;
import entities.HourlyEmployee;

public class Payroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new HourlyEmployee(),
                new CommissionEmployee(),
                new BasePlusCommissionEmployee()
        };
        for (Employee i : employees) {
            System.out.println(i);

            if (i instanceof BasePlusCommissionEmployee) {
                System.out.println("weekly earnings " + (i.earnings()*1.1));
            }
            else
                System.out.println("earnings" + i.earnings());
        }
    }
}
