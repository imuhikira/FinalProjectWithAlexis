package edu.dmacc.codedsm.FinalProject;

public interface EmployeeRepository {

    public Employee getEmployeeById(int id);

    public void  saveEmployee (Employee employee);
}
