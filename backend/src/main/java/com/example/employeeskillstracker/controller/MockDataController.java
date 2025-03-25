//TODO : blank space
package com.example.employeeskillstracker.controller;

//TODO : bad practice to use wildcard in import
import org.springframework.web.bind.annotation.*;

import java.util.*;

//TODO : i dont see any validation, any exception handled, all endpoints return 200?
//TODO : no api requires token?
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") //TODO : needs to configure this in application.properties
public class MockDataController {

    //TODO : change Map for DTO objects with validators. Map accepts any field.
    // With domain object helps maintainability and readability of system domain. Its not type safety
    //TODO : cant scale if all instances saves objects in memory. Its better to save and load from a database
    private List<Map<String, Object>> employees = new ArrayList<>();
    private List<Map<String, Object>> skills = new ArrayList<>();
    private List<Map<String, Object>> employeeSkills = new ArrayList<>();

    //TODO : initialize data in constructor can prevent of initialize the application. Maybe handle exception with catch to consume the exception
    //TODO : also if we use a database, can upload the application with default data.
    public MockDataController() {
        // Initialize mock data
        //TODO : this creates immutable maps, if its needed to modify data later, wont work.
        Map<String, Object> emp1 = Map.of("id", 1, "name", "John Doe", "email", "john.doe@fuel50.com", "jobTitle", "Software Engineer", "department", "Engineering");
        Map<String, Object> emp2 = Map.of("id", 2, "name", "Jane Smith", "email", "jane.smith@fuel50.com", "jobTitle", "Product Manager", "department", "Product");
        employees.add(emp1);
        employees.add(emp2);

        Map<String, Object> skill1 = Map.of("id", 101, "skillName", "Java", "skillCategory", "Backend Development");
        Map<String, Object> skill2 = Map.of("id", 102, "skillName", "Angular", "skillCategory", "Frontend Development");
        skills.add(skill1);
        skills.add(skill2);
    }

    //TODO : use version also like v1/employees
    //TODO : is a good practice to return a ResponseEntity with a status code
    //TODO : GETs can use cache to avoid hitting the database
    @GetMapping("/employees")
    public List<Map<String, Object>> getEmployees() {
        return employees;
    }

    @GetMapping("/skills")
    public List<Map<String, Object>> getSkills() {
        return skills;
    }

    //TODO : in RESTFul its better to not mix resources in path, so think about employees/skills instead of employee-skills
    @PostMapping("/employee-skills")
    public Map<String, Object> assignSkill(@RequestBody Map<String, Object> assignment) {
        //TODO : does not check if exists?
        //TODO : need to validate the data
        employeeSkills.add(assignment);
        return assignment; //TODO : the system does not create any id? so why is returning the object?
    }

    //TODO : this code must be in other class far from a controller. A Controller cant have business code.
    //TODO : when ask for a resource, its better to use /employee-skills/{employeeId} this is RESTful, and not as /resource?employeeId={employeeId}
    @GetMapping("/employee-skills")
    public List<Map<String, Object>> getEmployeeSkills(@RequestParam int employeeId) {
        //TODO : for searching can use stream instead
        List<Map<String, Object>> result = new ArrayList<>();
        for (Map<String, Object> es : employeeSkills) {
            if (Objects.equals(es.get("employeeId"), employeeId)) {
                result.add(es);
            }
        }
        return result;
    }
}
