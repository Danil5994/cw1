//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 55000);
        employees[3] = new Employee("Кузнецов Кузьма Кузьмич", 4, 70000);
        employees[4] = new Employee("Алексеев Алексей Алексеевич", 5, 65000);
        employees[5] = new Employee("Борисов Борис Борисович", 1, 52000);
        employees[6] = new Employee("Морозов Мороз Морозович", 2, 62000);
        employees[7] = new Employee("Снегирев Снегирь Снегирович", 3, 58000);
        employees[8] = new Employee("Емельянов Емельян Емельяныч", 4, 75000);
        employees[9] = new Employee("Тарасов Тарас Тарасович", 5, 68000);

        printEmployees(employees);
        System.out.println("Сумма затрат на ЗП в месяц: " + sumSalary(employees));
        System.out.println("Сотрудник с минимальной ЗП: " + findMinSalaryEmployee(employees));
        System.out.println("Сотрудник с максимальной ЗП: " + findMaxSalaryEmployee(employees));
        System.out.println("Среднее значение зарплат: " + averageSalary(employees));
        printEmployeeFio(employees);
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double sumSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalaryEmployee(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployee(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double averageSalary(Employee[] employees) {
        return sumSalary(employees) / employees.length;
    }

    public static void printEmployeeFio(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }
    }
}