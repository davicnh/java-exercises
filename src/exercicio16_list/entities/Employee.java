package exercicio16_list.entities;

public class Employee {

    public Integer id;
    public String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void incraseSalary(double percentage) {
        salary = salary * (1 + percentage / 100);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
