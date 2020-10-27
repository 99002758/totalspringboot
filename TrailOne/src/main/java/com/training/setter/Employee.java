package com.training.setter;

 

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

 

@Component
@Scope("prototype")
public class Employee {

 

    String name;
    int id;
    String department;
    Address address;
    public Employee(Address address) {
	
		this.address = address;
	}
	public String getName() {
        return name;
    }
    @Value("${employee.name}")
    
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    @Value("${employee.id}")
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getDepartment() {
        return department;
    }
    @Value("${employee.dept}")
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", department=" + department + "]";
    }
}