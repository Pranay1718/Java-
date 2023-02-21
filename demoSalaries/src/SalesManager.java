public class SalesManager extends Employee{
    float emp_comission;

    public SalesManager(String emp_name,float emp_salary,float emp_bonus,float emp_comission)
    {
        super(emp_name,emp_salary,emp_bonus);

        this.emp_comission=emp_comission;
    }

    @Override
    public void salaries() {
        super.salaries();
        emp_salary=emp_salary+emp_comission;
        System.out.println("The Sales Manager Salary is "+emp_salary);
    }
}
