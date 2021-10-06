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
    @Column(nullable = false)
    @NotNull(message = "The employee's ID is required.")
    private Long EmployeeID;

    @Column(nullable = false)
    @NotBlank(message = "The employee's First Name is required.")
    private String FirstName;

    @Column(nullable = false)
    @NotBlank(message = "The employee's Middle Name is required.")
    private String MiddleName;

    @Column(nullable = false)
    @NotBlank(message = "The employee's Last Name is required.")
    private String LastName;

    @Column(nullable = false)
    @NotBlank(message = "The employee's Role is required.")
    private Long EmployeeRole;

    private String Email;

    @Column(nullable = false)
    @NotBlank(message = "The employee's Phone Number is required.")
    private String Phone;
}
