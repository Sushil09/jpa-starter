package com.sjsuhil09.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_DATA")
public class Employee {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "employee_name", length = 100)
    private String name;

    private int age;

    //EnumType..Ordinary (assigns number to values in order they are saved.)
    // String (saves the value as string as is)
    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(unique = true, length = 10, nullable = false, updatable = false)
    private String ssn;

}
