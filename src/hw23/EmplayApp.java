package hw23;

public class EmplayApp {
    public static void main(String[] args) {
        Employee employee = new Employee("vasy", 18, 1000);
        employee.info();
        System.out.println(employee.getName());

        Employee Peter = new Employee("Peter", 45, 1100);
        employee.info();
        System.out.println(employee.getSalary());
        Peter.setSalary(1500);
        Peter.info();
    }
}
