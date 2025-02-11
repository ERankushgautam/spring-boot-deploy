package in.spring.deploy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.spring.deploy.entities.Employee;

@Repository
public interface EmployeRepo extends JpaRepository<Employee, Long>{

}
