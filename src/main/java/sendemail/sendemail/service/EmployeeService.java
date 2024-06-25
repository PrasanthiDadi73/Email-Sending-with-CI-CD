package sendemail.sendemail.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sendemail.sendemail.entity.Employee;
import sendemail.sendemail.repo.EmployeeRepository;

public interface EmployeeService {
	List<Employee> getEmployeesWithBirthdaysToday();
}

@Service
class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeesWithBirthdaysToday() {
        Calendar today = Calendar.getInstance();
        int currentMonth = today.get(Calendar.MONTH) + 1;
        int currentDay = today.get(Calendar.DAY_OF_MONTH);

        return employeeRepository.getEmployeesWithBirthdays(currentMonth, currentDay);
    }
}
