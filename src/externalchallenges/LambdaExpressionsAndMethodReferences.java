package externalchallenges;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class LambdaExpressionsAndMethodReferences {
    public static void main(String[] args) {
        var employees = new ArrayList<Employee>();
        employees.add(new Employee("João", new BigDecimal("8900"), false));
        employees.add(new Employee("Maria", new BigDecimal("13000"), true));
        employees.add(new Employee("Manoel", new BigDecimal("5000"), true));
        employees.add(new Employee("Terezinha", new BigDecimal("12000"), true));
        employees.add(new Employee("Sebastiana", new BigDecimal("7000"), false));

        // TODO remove inactive employees
        employees.removeIf(Employee::isInactive);

        // TODO sort employees by salary
        employees.sort((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));

        // TODO iterate and print employees using static print method
        employees.forEach(LambdaExpressionsAndMethodReferences::print);

    }
    private static void print(Employee employee) {
        // TODO implement print of name, salary and taxes (20%)
        System.out.println(employee + ", tax: $" + currencyFormat(calculateTax(employee)));
    }

    private static BigDecimal calculateTax(Employee employee){
        return employee.getSalary().multiply(new BigDecimal(0.2));
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getInstance(Locale.US).format(n);
    }

    private static class Employee {

        private final String name;
        private final BigDecimal salary;
        private final boolean active;

        public Employee(String name, BigDecimal salary, boolean active) {
            this.name = name;
            this.salary = salary;
            this.active = active;
        }

        public String getName() {
            return name;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public boolean isActive() {
            return active;
        }

        public boolean isInactive() {
            return !isActive();
        }

        @Override
        public String toString() {
            return "name: " + name +
                    ", salary: $" + currencyFormat(salary) +
                    ", active: " + active;
        }
    }
}
