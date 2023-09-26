package codingTasks2.Homework;

import java.util.HashMap;
import java.util.Map;
/*Create a Map that will store Employee name and salary.
 Write a logic to retrieve an employee who gets the highest salary.
 Output should be in the below format
John Smith=$100000
 */

public class EmployeeSalary {
    public static void main(String[] args) {
        Map<String,Double>employeeSalaries=new HashMap();
        employeeSalaries.put("Salih", 30000.0);
        employeeSalaries.put("Ali",2500.0);
        employeeSalaries.put("Mehmet",2600.0);
        employeeSalaries.put("Veli",2400.0);
        employeeSalaries.put("Anil",2300.0);
        double highestSalary=0.0;
        String highestPaidEmployee=" ";
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            String employeeName = entry.getKey();
            double salary = entry.getValue();
            if (salary > highestSalary) {
                highestSalary = salary;
                highestPaidEmployee = employeeName;
            }

        }
        System.out.println(highestPaidEmployee+"=$"+highestSalary);
    }
}
