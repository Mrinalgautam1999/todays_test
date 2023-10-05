package com.example.mapping.Controller;

import com.example.mapping.Model.Address;
import com.example.mapping.Model.Emp;
import com.example.mapping.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;


    @PostMapping("upload/emp")
    public String addEmp(@RequestBody List<Emp> newEmp){
        return empService.addEmp(newEmp);
    }

    @GetMapping("api/total/emp")
    public List<Emp> getAllEmployee(){
        return empService.getAllEmployee();
    }

    @GetMapping("api/total/emp/{id}")
    public Emp getEmployeeById(@PathVariable Long id){
        return empService.getEmpById(id);
    }

    @PutMapping("api/change/by/{id}")
    public String updateById(@PathVariable Long id, @RequestBody Address address){
        return empService.updateById(id, address);
    }

    @DeleteMapping("api/remove/by/{id}/id")
    public String deleteById(@PathVariable Long id){
        return empService.deleteById(id);
    }

}
