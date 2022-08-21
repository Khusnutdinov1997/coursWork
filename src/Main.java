public class Main {

    static Employee[] employees = new Employee[10];

        public static void main(String[] arg) {
            employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 90_000);
            employees[1] = new Employee("Ivanov", " Ilya", "Viktorovich", 1, 85_000);
            employees[2] = new Employee("Petrov", "Victor", "Anatolevich", 2, 83_900);
            employees[3] = new Employee("Zamaletdinov", "Ilshat", "Ildusovich", 2, 97_103);
            employees[4] = new Employee("Timofeev", "Petor", "Petrovich", 2, 72_800);
            employees[5] = new Employee("Batryt3dinov", "Akakya", "Svyatoslavovich", 2, 110_000);
            employees[6] = new Employee("Tugolukov", "Aleksei", "Romanovich", 2, 150_000);
            employees[7] = new Employee("Novikov", "Vladislav", "Nikolaevich", 2, 145_000);
            employees[8] = new Employee("Petrova", "VAleriya", "Uriyvna", 2, 80_000);
            employees[9] = new Employee("Volcova", "Viktoriya", "Anatolevna", 2, 92_000);
            printAllEployee();
            System.out.println("Сумма затрат на зарплаты в месяц: " + getAndCalculateSalarySum());
            System.out.println(getEmployeeMinSalary());
            System.out.println(getEmployeeMaxSakary());
            System.out.println("Среднее значение зарплат: " + getAndCalculationAverageSalary());
        }

        public static void printAllEployee() {
            for (Employee emplyoee : employees) {
                System.out.println(emplyoee);
            }
        }

        public static double getAndCalculateSalarySum() {
            double sum = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    sum = sum + employees[i].getSalaryEmployee();
                }
            }
            return sum;
        }

        public static Employee getEmployeeMinSalary() {
            double minSalary = -1;
            Employee minSalaryEmployee = null;
            int index = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    minSalary = employees[i].getSalaryEmployee();
                    minSalaryEmployee = employees[i];
                    index = i;
                    break;
                }
            }

            for (int i = index; i < employees.length; i++) {
                if (minSalaryEmployee != null) {
                    if (minSalary > employees[i].getSalaryEmployee()) {
                        minSalary = employees[i].getSalaryEmployee();
                        minSalaryEmployee = employees[i];
                    }
                }
            }
            return minSalaryEmployee;
        }

        public static Employee getEmployeeMaxSakary() {
            double maxSalary = -1;
            Employee maxSalaryEmployee = null;
            int index = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    maxSalary = employees[i].getSalaryEmployee();
                    maxSalaryEmployee = employees[i];
                    index = i;
                    break;
                }
            }
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    if (maxSalary < employees[i].getSalaryEmployee()) {
                        maxSalary = employees[i].getSalaryEmployee();
                        maxSalaryEmployee = employees[i];
                    }
                }
            }
            return maxSalaryEmployee;
        }

        public static double getAndCalculationAverageSalary() {
            double sumSalaryAllEmployees = getAndCalculateSalarySum();
            if (sumSalaryAllEmployees != 0) {
                return sumSalaryAllEmployees/ employees.length;
            }else {
                return 0;
            }
        }

}