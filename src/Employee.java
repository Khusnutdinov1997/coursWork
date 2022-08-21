public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    private int deportment;
    private int salaryEmployee;
    private static int counter;
    private final int id;



    public Employee (String surname,String name, String patronymic, int deportment,int salaryEmployee){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.deportment = deportment;
        this.salaryEmployee = salaryEmployee;
        id = ++counter;
    }

    public String getSurname () {
        return surname;
    }

    public String getName () {
        return name;
    }

    public String getPatronymic () {
        return patronymic;
    }

    public int getDeportment () {
        return deportment;
    }

    public int getSalaryEmployee () {
        return salaryEmployee;
    }


    public int getId () {
        return this.id;
    }

    public void setSalaryEmployee ( int salaryEmployee){
        this.salaryEmployee = salaryEmployee;
    }

    public void setDeportment ( int deportment){
        this.deportment = deportment;
    }

    public String toString () {
        return "Employee: " + "Full Name: " + getSurname() + " " + getName() + " " + getPatronymic() + ", Deportament: " + getDeportment() + ", Salary: " + getSalaryEmployee() + ", ID: " + getId();
    }
}

