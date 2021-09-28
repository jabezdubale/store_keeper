package com.demo.store_keeper.domains;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Employee_Info {

    @Id
    @NotNull(message = "The employee's ID is required.")
    @Column(nullable = false)
    private long EmployeeID;

    @NotBlank(message = "The employee's First Name is required.")
    @Column(nullable = false)
    private String FirstName;

    @NotBlank(message = "The employee's Middle Name is required.")
    @Column(nullable = false)
    private String MiddleName;

    @NotBlank(message = "The employee's Last Name is required.")
    @Column(nullable = false)
    private String LastName;

    @NotBlank(message = "The employee's Role is required.")
    @Column(nullable = false)
    private int EmployeeRole;

    private String Email;

    @NotBlank(message = "The employee's Phone Number is required.")
    @Column(nullable = false)
    private String Phone;


}
