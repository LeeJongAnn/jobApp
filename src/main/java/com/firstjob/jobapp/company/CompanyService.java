package com.firstjob.jobapp.company;

import java.util.List;

public interface CompanyService {


    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

}