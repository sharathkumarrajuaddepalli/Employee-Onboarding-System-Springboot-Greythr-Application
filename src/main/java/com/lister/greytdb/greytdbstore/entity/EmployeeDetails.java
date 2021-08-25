package com.lister.greytdb.greytdbstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class EmployeeDetails {
    @Id
    private int empId;
    @Column(length = 10, unique = true)
    private String code;
    @Column()
    private String role;
    @Column(length = 60)
    private String name;
    @Column(length = 15, unique = true)
    private String phoneNumber;
    @Email(message = "Incorrect Email")
    @Column(length = 50, nullable = false, unique = true)
    private String emailId;
    @Column(length = 5)
    private String bloodGroup;
    @Column(length = 12)
    private String aadharNumber;
    private LocalDate dob;
    @Column(length = 6)
    private String gender;
    private double sslc;
    private double hsc;
    private double ug;
    @Column(length = 30)
    private String fatherName;
    @Column(length = 30)
    private String motherName;
    @Column(length = 30)
    private String emergencyContactName;
    @Column(length = 30)
    private String emergencyContactRelation;
    @Column(length = 15)
    private String emergencyContactNumber;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_Id")
    private List<Address> addressList;
}
