package net.javaguides.springboot.controller;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    public EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee saveemployee = employeeService.createEmployee(employee);
        System.out.println("added data "+ saveemployee);
        return new ResponseEntity<>(saveemployee, HttpStatus.CREATED);
 
    }

    //old implementation

//    @PostMapping
//    public Employee createEmployee(@RequestBody Employee employee){
//        System.out.println("added data "+ employee);
//        return employeeRepository.save(employee);
//    }


    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeId(@PathVariable long id){
        Employee employee = employeeService.getEmployeeById(id);
        System.out.println("getting employee data "+ employee);
        return ResponseEntity.ok(employee);
    }

    //Old implementation
//    @GetMapping("{id}")
//    public ResponseEntity<Employee> getEmployeeId(@PathVariable long id){
//        Employee employee = employeeRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id : " + id));
//        System.out.println("getting data "+ employee);
//        return ResponseEntity.ok(employee);
//
//    }


    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
        Employee updateEmployee = employeeService.updateEmployee(id,employeeDetails);

        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());


        employeeRepository.save(updateEmployee);
        System.out.println("updated data  "+ updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

//    @PutMapping("{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
//        Employee updateEmployee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
//
//        updateEmployee.setFirstName(employeeDetails.getFirstName());
//        updateEmployee.setLastName(employeeDetails.getLastName());
//        updateEmployee.setEmailId(employeeDetails.getEmailId());
//
//
//        employeeRepository.save(updateEmployee);
//        System.out.println("updated data  "+ updateEmployee);
//
//        return ResponseEntity.ok(updateEmployee);
//    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){

        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id: " + id));

        employeeRepository.delete(employee);
        System.out.println("deleted succeessfully "+ employee);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
