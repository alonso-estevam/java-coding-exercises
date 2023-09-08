package externalchallenges;

import java.math.BigDecimal;
import java.util.ArrayList;

public class LambdaExpressionsAndMethodReferences {
    public static void main(String[] args) {
        var employees = new ArrayList<Employee>();
        employees.add(new Employee("João", new BigDecimal("8900"), false));
        employees.add(new Employee("Maria", new BigDecimal("13000"), true));
        employees.add(new Employee("Manoel", new BigDecimal("5000"), true));
        employees.add(new Employee("Terezinha", new BigDecimal("12000"), true));
        employees.add(new Employee("Sebastiana", new BigDecimal("7000"), false));

        // TODO remove inactive employees

        // TODO sort employees by salary

        // TODO iterate and print employees using static print method

    }
    private static void print(Employee employee) {
        // TODO implement print of name, salary and taxes (20%)
        System.out.println(employee);
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
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", active=" + active +
                    '}';
        }
    }
}
