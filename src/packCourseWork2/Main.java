package packCourseWork2;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60_000);
        employees[2] = new Employee("Денисов Денис Денисович", 3, 30_000);
        employees[3] = new Employee("Данилов Данил Данилович", 4, 80_000);
        employees[4] = new Employee("Евгеньев Евгений Евгеньевич", 5, 90_000);
        employees[5] = new Employee("Александров Александр Александрович", 1, 100_000);
        employees[6] = new Employee("Владимиров Владимир Вадимирович", 2, 45_000);
        employees[7] = new Employee("Борисов Борис Борисович", 3, 55_000);
        employees[8] = new Employee("Дмитриев Дмитрий Дмитриевич", 4, 65_000);
        employees[9] = new Employee("Максимов Максим Максимович", 5, 75_000);

        printEmployee();
        System.out.printf("%n%n");
        System.out.printf("сумма затрат на зарплаты в месяц: %.2f руб%n", sumSalary());
        sumSalary();
        System.out.printf("%n%n");
        System.out.printf("Сотрудник с максимальной ЗП - %s%n", minSelary());
        System.out.printf("%n%n");
        System.out.printf("Сотрудник с максимальной ЗП - %s%n", maxSelary());
        System.out.printf("%n%n");
        System.out.printf("среднее значение зарплат: %.2f руб%n", meanSalary());
        meanSalary();
        System.out.printf("%n%n");
        fio();
        System.out.printf("%n%n");

//////////////////повышенный уровень
        System.out.printf("Индексация ЗП: %n%n");
        indexedSalary(0);
        System.out.printf("%n%n");
        System.out.printf("Сотрудник с минимальной ЗП в отделе- %s %n%n", minSalaryInDep(2));
        System.out.printf("Сотрудник с максимальной ЗП в отделе- %s %n%n", maxSalaryInDep(2));


    }

    static void printEmployee() {
        System.out.print("список всех сотрудников:");
        for (Employee i : employees) {
            System.out.print(i);
        }
    }

    static double sumSalary() {
        double sum = 0;
        for (Employee i : employees) {
            sum += i.getSalary();
        }
        return sum;
    }

    static Employee minSelary() {
        Employee poorEmployee = employees[0];
        for (Employee i : employees) {
            if (poorEmployee.getSalary() > i.getSalary()) {
                poorEmployee = i;
            }
        }
        return poorEmployee;
    }

    static Employee maxSelary() {
        Employee richEmployee = employees[0];
        for (Employee i : employees) {
            if (richEmployee.getSalary() < i.getSalary()) {
                richEmployee = i;
            }
        }
        return richEmployee;
    }

    static double meanSalary() {
        double mean = 0;
        int n = 0;
        for (Employee i : employees) {
            n++;
        }
        mean = sumSalary() / n;
        return mean;
    }

    static void fio() {
        String fio = employees[0].getFullName();
        for (Employee i : employees) {
            fio = i.getFullName();
            System.out.printf("Ф. И. О. - %s%n", fio);
        }
    }

    static void indexedSalary(double arg) {
        for (Employee i : employees) {
            i.setSalary(i.getSalary() * (arg / 100 + 1));
            System.out.printf("%s - %.2f%n", i.getFullName(), i.getSalary());
        }
    }

    static Employee minSalaryInDep(int dep) {
        Employee poorEmployee = employees[0];
        double min = maxSelary().getSalary();
        for (Employee i : employees) {
            if (i.getDepartment() == dep && i.getSalary() <= min ) {
                poorEmployee = i;
                min=i.getSalary();
            }
        }
        return poorEmployee;
    }
    static Employee maxSalaryInDep(int dep) {
        Employee richEmployee = employees[0];
        double max = minSelary().getSalary();
        for (Employee i : employees) {
            if (i.getDepartment() == dep && max <= i.getSalary()) {
                richEmployee = i;
                max=i.getSalary();
            }
        }
        return richEmployee;
    }

}
