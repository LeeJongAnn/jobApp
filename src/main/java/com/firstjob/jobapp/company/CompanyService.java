package com.firstjob.jobapp.company;

import com.firstjob.jobapp.review.Review;

import java.util.List;

public interface CompanyService {


    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    boolean deleteCompany(Long id);

    Company getCompanyById(Long companyId);


}
