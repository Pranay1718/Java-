public class TechLead extends Employee{
    public TechLead(String emp_name, float emp_salary, float emp_bonus) {
        super(emp_name, emp_salary, emp_bonus);
    }

    @Override
    public void salaries() {
        super.salaries();
        System.out.println("The Tech Lead Salary is "+emp_salary);
    }
}
