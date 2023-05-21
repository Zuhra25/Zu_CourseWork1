package packCourseWork1;

public class Main {
//    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        EmployeeBook employees = new EmployeeBook();

        employees.addEmployee("Иванов Иван Иванович", 1, 50_000);
        employees.addEmployee("Петров Петр Петрович", 2, 60_000);
        employees.addEmployee("Денисов Денис Денисович", 3, 30_000);
        employees.addEmployee("Данилов Данил Данилович", 4, 80_000);
        employees.addEmployee("Евгеньев Евгений Евгеньевич", 5, 90_000);
        employees.addEmployee("Александров Александр Александрович", 1, 100_000);
        employees.addEmployee("Владимиров Владимир Вадимирович", 2, 45_000);
        employees.addEmployee("Борисов Борис Борисович", 3, 55_000);
        employees.addEmployee("Дмитриев Дмитрий Дмитриевич", 4, 65_000);
        employees.addEmployee("Максимов Максим Максимович", 5, 75_000);

        employees.printEmployee();
        System.out.printf("%n%n");
        System.out.printf("сумма затрат на зарплаты в месяц: %.2f руб%n", employees.sumSalary());
        //EmployeeBook.sumSalary();
        System.out.printf("%n%n");
        System.out.printf("Сотрудник с максимальной ЗП - %s%n", employees.minSelary());
        System.out.printf("%n%n");
        System.out.printf("Сотрудник с максимальной ЗП - %s%n", employees.maxSelary());
        System.out.printf("%n%n");
        System.out.printf("среднее значение зарплат: %.2f руб%n", employees.meanSalary());
        employees.meanSalary();
        System.out.printf("%n%n");
        employees.fio();
        System.out.printf("%n%n");

//////////////////повышенный уровень
        System.out.printf("Индексация ЗП: %n");
        employees.indexedSalary(0);
        System.out.printf("%n%n");
        System.out.printf("Сотрудник с минимальной ЗП в отделе- %s %n%n", employees.minSalaryInDep(2));
        System.out.printf("Сотрудник с максимальной ЗП в отделе- %s %n%n", employees.maxSalaryInDep(2));
        System.out.printf("Сумма затрат на ЗП по отделу- %.2f %n%n", employees.sumSalaryInDep(5));
        System.out.printf("Средняя ЗП по отделу - %.2f %n", employees.meanSalaryInDep(5));
        System.out.printf("%n%n");
        System.out.printf("Индексация по отделу: %n");
        employees.indexedSalaryInDep(1, 0);
        System.out.printf("%nВсе сотрудники (кроме отдела):%n");
        employees.printEmployeeWithoutDep();
        System.out.printf("%n%n");
        employees.salaryLessArg(50_000);
        System.out.printf("%n%n");
        employees.salaryMoreArg(50_000);
        System.out.println("Удалили сотрудника");
        employees.deleteEmployee("Денисов Денис Денисович");
        //employees.deleteEmployee(2);
        employees.printEmployee();
        System.out.println();

        System.out.println("Изменили ЗП");
        employees.changeSalary("Александров Александр Александрович", 1.1);
        employees.printEmployee();
        System.out.println();

        System.out.println("Изменили департамент");
        employees.changeDep("Петров Петр Петрович", 1);
        employees.printEmployee();
        System.out.println();

        employees.printDepAndFullnames();

    }


}
