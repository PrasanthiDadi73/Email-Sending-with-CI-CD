package sendemail.sendemail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sendemail.sendemail.entity.Employee;
import sendemail.sendemail.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/birthdays")
	public List<Employee> getEmployeesWithBirthdaysToday() {
		return employeeService.getEmployeesWithBirthdaysToday();
	}
}
