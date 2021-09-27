package com.demo.store_keeper.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Employee_Info {

    @Id
    private long EmployeeID;

    private String FirstName;

    private String MiddleName;

    private String LastName;

    private int EmployeeRole;

    private String Email;

    private long Phone;


}
