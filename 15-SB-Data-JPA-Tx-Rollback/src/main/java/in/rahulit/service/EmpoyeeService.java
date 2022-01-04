package in.rahulit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.rahulit.entity.Address;
import in.rahulit.entity.Employee;
import in.rahulit.repository.AddressRepository;
import in.rahulit.repository.EmployeeRepository;

@Service
public class EmpoyeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private AddressRepository addressRepository;

	//@Transactional(rollbackFor = Exception.class)
	public void saveData() {
		Employee emp = new Employee();
		emp.setEmpId(103);
		emp.setEmpName("Rani");
		emp.setEmpSal(350000.00);
		employeeRepository.save(emp); // tx will be committed

		// logic
		int i = 10 / 0;

		Address addr = new Address();
		addr.setAddrId(302);
		addr.setEmpId(103);
		addr.setCity("Agra");
		addr.setState("UP");
		addr.setCountry("India");
		addressRepository.save(addr); // tx will be committed

	}

}
