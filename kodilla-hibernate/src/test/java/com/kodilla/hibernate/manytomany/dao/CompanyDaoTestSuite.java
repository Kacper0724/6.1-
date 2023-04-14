package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);
        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //Do nothing
        }
    }

    @Test
    void testRetrieveEmployeeThroughtLastname() {
        //Given
        Employee employee = new Employee("Jasmine", "Parker");
        Employee employee1 = new Employee("Peter", "Walker");
        Employee employee2 = new Employee("Walter", "Wilford");
        Company company = new Company("Electrical store");
        employee.getCompanies().add(company);
        employee1.getCompanies().add(company);
        employee2.getCompanies().add(company);
        company.getEmployees().add(employee);
        company.getEmployees().add(employee1);
        company.getEmployees().add(employee2);
        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        //When
        List<Employee> resultList = employeeDao.retrieveEmployeeThroughtLastname("Wilford");
        for (Employee resultEmployee : resultList) {
            System.out.println(resultEmployee.getFirstname() + " " + resultEmployee.getLastname());
        }
        //Then
        assertEquals(1, resultList.size());
        //CleanUp
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void testRetrieveCompanyByThreeFirstChar() {
        //Given
        Employee employee = new Employee("Walter", "Wilford");
        Company company = new Company("Electrical store");
        Company company1 = new Company("Building store");
        Company company2 = new Company("Grocery");
        Company company3 = new Company("Homebrew store");
        employee.getCompanies().add(company);
        employee.getCompanies().add(company1);
        employee.getCompanies().add(company2);
        employee.getCompanies().add(company3);
        company.getEmployees().add(employee);
        company1.getEmployees().add(employee);
        company2.getEmployees().add(employee);
        company3.getEmployees().add(employee);
        //When
        employeeDao.save(employee);
        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        List<Company> resultList = companyDao.retrieveCompanyByThreeFirstChar("Ele");
        for (Company resultCompany : resultList) {
            System.out.println(resultCompany.getName());
        }
        //Then
        assertEquals(1, resultList.size());
        //CleanUp
        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            //Do nothing
        }
    }
}
