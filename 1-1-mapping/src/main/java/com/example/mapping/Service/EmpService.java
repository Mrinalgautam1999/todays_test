package com.example.mapping.Service;

import com.example.mapping.Model.Address;
import com.example.mapping.Model.Emp;
import com.example.mapping.Repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepo empRepo;

    public String addEmp(List<Emp> newEmp) {
        empRepo.saveAll(newEmp);
        return "added employee";
    }

    public List<Emp> getAllEmployee() {
        return empRepo.findAll();
    }

    public Emp getEmpById(Long id) {
        return empRepo.findById(id).orElseThrow();
    }

    public String updateById(Long id, Address address) {
        Emp emp = empRepo.findById(id).orElseThrow();
        emp.setAddress(address);
        return "updated";
    }

    public String deleteById(Long id) {
        empRepo.deleteById(id);
        return "deleted";
    }
}
