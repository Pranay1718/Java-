public class EmployeeImpl {
    public static void main(String[] args)
    {
        Employee employee=new SalesManager("Pranay",54543f,434f,545f);
        Employee employee1=new TechLead("Pranay Reddy", 445f,76f);
        employee.salaries();
        employee1.salaries();
    }
}
