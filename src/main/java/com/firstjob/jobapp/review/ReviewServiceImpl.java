package com.firstjob.jobapp.review;

import com.firstjob.jobapp.company.Company;
import com.firstjob.jobapp.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ReviewServiceImpl implements ReviewService{

    private ReviewRepository reviewRepository;

    private CompanyService companyService;
    @Override
    public List<Review> getAllReviews(Long companyId) {

        List<Review>  reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;

    }

    @Override
    public void addReviews(Long companyId, Review review) {
        Company company = companyService.getCompanyById(companyId);
        if (company != null) {
            review.setCompany(company);
            reviewRepository.save(review);
        }
    }

    @Override
    public boolean updateReview(Long companyId, Long ReviewId) {
        Company company = companyService.getCompanyById(companyId);
        System.out.println(company);
        return true;
    }
}
