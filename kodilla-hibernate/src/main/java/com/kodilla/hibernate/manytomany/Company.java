package com.kodilla.hibernate.manytomany;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@NamedNativeQuery(
        name = "Company.retrieveCompanyByThreeChar",
        query = "SELECT * FROM COMPANIES" + " WHERE SUBSTRING(company_name,1,3) LIKE :NAME",
        resultClass = Company.class

)

@NamedNativeQuery(
        name = "Company.searchByName",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT('%', :NAME, '%')",
        resultClass = Company.class
)

@Entity
@Table(name="COMPANIES")
@Service
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>(  );

    public Company(){

    }

    public Company(String name) {
        this.name = name;
    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name="COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
