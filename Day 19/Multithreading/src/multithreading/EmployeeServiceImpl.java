package multithreading;

public class EmployeeServiceImpl extends Thread implements EmployeeService {
    public EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run() {
      employeeRepository.display();
    }
}
