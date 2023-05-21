package packCourseWork1;

public class EmployeeBook {
    private final Employee[] employees;
    private static int count = 0;//счетчик добавленного сотрудника
    private int size=10;//10 сотрудников

    public EmployeeBook() {
        this.employees = new Employee[size];
    }

    public void addEmployee(String name, int dep, double salary) {  //ОчСложно. 4.a. Добавить нового сотрудника
        if (count < size) {
            for (int i=0; i<size; i++) {
                if (employees[i] == null) {
                    employees[i] = new Employee(name, dep, salary);
                   count++;
                   break;
                }
            }
        }
    }
    public void deleteEmployee(int id) {  //ОчСложно. 4.b. Удалить сотрудника
            for (int i=0; i<size; i++) {
                if (employees[i] != null && employees[i].getId() == id) {
                    employees[i] = null;
                   count--;
                }
            }
    }
//    public void deleteEmployee(String fullname) {  //ОчСложно. 4.b. Удалить сотрудника
//        for (int i=0; i<size; i++) {
//            if (employees[i] != null && employees[i].getFullName() == fullname) {
//                employees[i] = null;
//                count--;
//            }
//        }
//    }



    void printEmployee() { //базовый. 8.a. Получить список всех сотрудников
        System.out.print("список всех сотрудников:");
        for (Employee i : employees) {
            System.out.print(i);
        }
    }

    double sumSalary() { //базовый. 8.b. Посчитать сумму затрат на зарплаты в месяц.
        double sum = 0;
        for (Employee i : employees) {
            sum += i.getSalary();
        }
        return sum;
    }

    Employee minSelary() { //базовый. 8.c. Найти сотрудника с минимальной зарплатой
        Employee poorEmployee = employees[0];
        for (Employee i : employees) {
            if (poorEmployee.getSalary() > i.getSalary()) {
                poorEmployee = i;
            }
        }
        return poorEmployee;
    }

    Employee maxSelary() {  //базовый. 8.d. Найти сотрудника с максимальной зарплатой.
        Employee richEmployee = employees[0];
        for (Employee i : employees) {
            if (richEmployee.getSalary() < i.getSalary()) {
                richEmployee = i;
            }
        }
        return richEmployee;
    }

    double meanSalary() {  //базовый. 8.e. Подсчитать среднее значение зарплат
        double mean = 0;
        int n = 0;
        for (Employee i : employees) {
            n++;
        }
        mean = sumSalary() / n;
        return mean;
    }

    void fio() {  //базовый. 8.f. Получить Ф. И. О. всех сотрудников
        String fio = employees[0].getFullName();
        for (Employee i : employees) {
            fio = i.getFullName();
            System.out.printf("Ф. И. О. - %s%n", fio);
        }
    }

    void indexedSalary(double arg) {  //повышенный. 1. Проиндексировать ЗП
        for (Employee i : employees) {
            i.setSalary(i.getSalary() * (arg / 100 + 1));
            System.out.printf("%s - %.2f%n", i.getFullName(), i.getSalary());
        }
    }

    Employee minSalaryInDep(int dep) {  //повышенный. 2.a. Сотрудника с минимальной зарплатой.
        Employee poorEmployee = employees[0];
        double min = maxSelary().getSalary();
        for (Employee i : employees) {
            if (i.getDepartment() == dep && i.getSalary() <= min) {
                poorEmployee = i;
                min = i.getSalary();
            }
        }
        return poorEmployee;
    }

    Employee maxSalaryInDep(int dep) {  //повышенный. 2.b. Сотрудника с максимальной зарплатой.
        Employee richEmployee = employees[0];
        double max = minSelary().getSalary();
        for (Employee i : employees) {
            if (i.getDepartment() == dep && max <= i.getSalary()) {
                richEmployee = i;
                max = i.getSalary();
            }
        }
        return richEmployee;
    }

    double sumSalaryInDep(int dep) {   //повышенный. 2.c. Сумму затрат на зарплату по отделу
        double sum = 0;
        for (Employee i : employees) {
            if (i.getDepartment() == dep) {
                sum += i.getSalary();
            }
        }
        return sum;
    }

    double meanSalaryInDep(int dep) {  //повышенный. 2.d. Среднюю зарплату по отделу
        int count = 0;
        double sum = 0;
        for (Employee i : employees) {
            if (i.getDepartment() == dep) {
                sum += i.getSalary();
                count++;
            }
        }
        sum /= count;
        return sum;
    }

    void indexedSalaryInDep(int dep, double arg) { //повышенный. 2.e. Проиндексировать ЗП отдела
        for (Employee i : employees) {
            if (i.getDepartment() == dep) {
                i.setSalary(i.getSalary() * (arg / 100 + 1));
                System.out.printf("%s - %.2f%n", i.getFullName(), i.getSalary());
            }
        }
    }

    void printEmployeeWithoutDep() {  //повышенный. 2.f. Напечатать всех сотрудников (кроме отдела)
        for (Employee i : employees) {
            System.out.printf("Сотрудник - %s, ЗП - %.2f, ID - %s%n", i.getFullName(), i.getSalary(), i.getId());
        }
    }

    void salaruLessArg(double arg) {   //повышенный. 3.a. сотрудников с зарплатой меньше числа
        for (Employee i : employees) {
            if (i.getSalary() < arg) {
                System.out.printf("ЗП менее %.2f, ID - %s, cотрудник - %s, ЗП - %.2f%n", arg, i.getId(), i.getFullName(), i.getSalary());
            }
        }
    }

    void salaruMoreArg(double arg) {   //повышенный. 3.a. сотрудников с зарплатой больше (или равно) числа
        for (Employee i : employees) {
            if (i.getSalary() >= arg) {
                System.out.printf("ЗП более %.2f, ID - %s, cотрудник - %s, ЗП - %.2f%n", arg, i.getId(), i.getFullName(), i.getSalary());
            }
        }
    }

}
