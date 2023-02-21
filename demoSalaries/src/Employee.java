public class Employee {

    String emp_name;
    float emp_salary;
    float emp_bonus;

    public Employee(String emp_name,float emp_salary,float emp_bonus)
    {
        this.emp_name=emp_name;
        this.emp_salary=emp_salary;
        this.emp_bonus=emp_bonus;

    }
    public void salaries()
    {
        emp_salary=emp_salary+emp_bonus;

    }
}
