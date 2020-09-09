package com.setrina.thymeleafapp.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Student {
    @NotNull
    @Id
    private Integer id;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String department;
    @NotNull
    @NotBlank
    private String updatedBy;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private Date updatedOn;

    public Student(Integer id, String name, String department, String updatedBy, Date updatedOn) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;

    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return String.format("id: [%s],  name: [%s], department: [%s], updatedBy: [%s], updatedOn: [%s],",
                id, name, department, updatedBy, updatedOn);
    }
}
