public class Main {
    private static Employee[] employees = new Employee[10];
    private static int size = 0;

    public static void main(String[] args) {
        addEmployee("Иванов Иван Иванович", 1, 50000);
        addEmployee("Петров Петр Петрович", 2, 60000);
        addEmployee("Сидоров Сидор Сидорович", 3, 55000);
        addEmployee("Кузнецов Кузьма Кузьмич", 4, 70000);
        addEmployee("Алексеев Алексей Алексеевич", 5, 65000);
        addEmployee("Борисов Борис Борисович", 1, 52000);
        addEmployee("Морозов Мороз Морозович", 2, 62000);
        addEmployee("Снегирев Снегирь Снегирович", 3, 58000);
        addEmployee("Емельянов Емельян Емельяныч", 4, 75000);
        addEmployee("Тарасов Тарас Тарасович", 5, 68000);

        printEmployees();
        System.out.println("Сумма затрат на ЗП: " + sumSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + findMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной ЗП: " + findMaxSalaryEmployee());
        System.out.println("Средняя зарплата: " + averageSalary());
        printEmployeeFio();
    }


    private static void addEmployee(String fio, int department, double salary) {
        if (size < employees.length) {
            employees[size++] = new Employee(fio, department, salary);
        }
    }


    public static void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static Employee findMinSalaryEmployee() {
        if (size == 0) return null;

        Employee min = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public static Employee findMaxSalaryEmployee() {
        if (size == 0) return null;

        Employee max = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    public static double averageSalary() {
        return size == 0 ? 0 : sumSalary() / size;
    }

    public static void printEmployeeFio() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getFio());
        }
    }
}