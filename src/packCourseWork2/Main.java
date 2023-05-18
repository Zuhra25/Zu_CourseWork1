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
        minSelary();
        System.out.printf("%n%n");
        maxSelary();
        System.out.printf("%n%n");
        System.out.printf("среднее значение зарплат: %.2f руб%n", meanSalary());
        meanSalary();
        System.out.printf("%n%n");
        fio();
        System.out.printf("%n%n");

//////////////////повышенный уровень
        indexedSalary(0);
        System.out.printf("%n%n");
        minSalaryInDep();

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

    static void minSelary() {
        double minSelary = employees[0].getSalary();
        Employee poorEmployee = employees[0];
        for (Employee i : employees) {
            if (minSelary > i.getSalary()) {
                poorEmployee = i;
                minSelary = i.getSalary();
            }
        }
        System.out.printf("Сотрудник с минимальной ЗП - %s (ЗП = %.2f руб)%n", poorEmployee.getFullName(), poorEmployee.getSalary());
    }

    static void maxSelary() {
        double maxSelary = employees[0].getSalary();
        Employee richEmployee = employees[0];
        for (Employee i : employees) {
            if (maxSelary < i.getSalary()) {
                richEmployee = i;
                maxSelary = i.getSalary();
            }
        }
        System.out.printf("Сотрудник с максимальной ЗП - %s (ЗП = %.2f руб)%n", richEmployee.getFullName(), richEmployee.getSalary());
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

    static void minSalaryInDep() {
        double minSelary = employees[0].getSalary();
        Employee poorEmployeeInDep1 = employees[0];
        Employee poorEmployeeInDep2 = employees[0];
        Employee poorEmployeeInDep3 = employees[0];
        Employee poorEmployeeInDep4 = employees[0];
        Employee poorEmployeeInDep5 = employees[0];

        for (Employee i : employees) {
            switch (i.getDepartment()){
                case 1:
                    if (minSelary > i.getSalary()) {
                        poorEmployeeInDep1 = i;
                        minSelary = i.getSalary();
            }
                case 2:
                    if (minSelary > i.getSalary()) {
                        poorEmployeeInDep2 = i;
                        minSelary = i.getSalary();
                    }
        }

        }
        for (int i=1; i<5;i++){

        }

//        for (Employee i : employees) {
//            if (i.getDepartment() == 1) {
//                if (minSelary > i.getSalary()) {
//                    poorEmployee = i;
//                    minSelary = i.getSalary();
//                }
//            }
//
//            if (i.getDepartment() == 2) {
//                if (minSelary > i.getSalary()) {
//                    poorEmployee = i;
//                    minSelary = i.getSalary();
//                }
//            }
//        }
            System.out.printf("Сотрудник с минимальной ЗП - %s (ЗП = %.2f руб) в отделе № %s%n", poorEmployee.getFullName(), poorEmployee.getSalary(), poorEmployee.getDepartment());





}
