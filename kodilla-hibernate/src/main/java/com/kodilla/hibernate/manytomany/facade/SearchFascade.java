package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFascade {
    List<Company> listOfmatchedCompanies;
    List<Employee> listOfmatchedEmployees;

    @Autowired
    CompanyDao companyDao;

   @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFascade.class);

    public List<Company> searchCompanyByName(String name)throws SearchProcessingException{
        listOfmatchedCompanies = companyDao.searchByName(name);
        if(listOfmatchedCompanies.size()==0){
            LOGGER.error(SearchProcessingException.ERR_COMPANY);
        }
        return listOfmatchedCompanies;
    }

    public List<Employee> searchEmployeeLastName(String lastName) throws SearchProcessingException{
        listOfmatchedEmployees = employeeDao.retrieveEmployeeLastName(lastName);
        if(listOfmatchedEmployees.size()==0){
            LOGGER.error(SearchProcessingException.ERR_EMPLOYEE);
        }
        return listOfmatchedEmployees;
    }
}
