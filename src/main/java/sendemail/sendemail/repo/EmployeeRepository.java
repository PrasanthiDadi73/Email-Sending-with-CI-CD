package sendemail.sendemail.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sendemail.sendemail.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> getEmployeesWithBirthdays(int currentMonth, int currentDay);

}
