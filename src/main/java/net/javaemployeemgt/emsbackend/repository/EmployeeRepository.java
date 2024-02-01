package net.javaemployeemgt.emsbackend.repository;

import net.javaemployeemgt.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD database Operations
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
