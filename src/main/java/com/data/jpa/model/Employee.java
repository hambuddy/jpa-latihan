package com.data.jpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Setter
@Getter
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    @Column(name = "firstName", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "lastName", nullable = false)
    public String getLastName() {
        return lastName;
    }

    @Column(name = "emailId", nullable = false)
    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "Employee [id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", emailId = " + emailId + "]";
    }

}
