package net.javaemployeemgt.emsbackend.mapper;

import net.javaemployeemgt.emsbackend.dto.EmployeeDto;
import net.javaemployeemgt.emsbackend.entity.Employee;

public class EmployeeMapper {
   //Map from emloyee JPA entity to dto class
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getID(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    //Map from employee dto class to employee JPA entity
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFristName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
