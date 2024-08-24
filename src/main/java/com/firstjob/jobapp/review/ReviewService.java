package com.firstjob.jobapp.review;

import java.util.List;

public interface ReviewService {


    List<Review> getAllReviews(Long companyId);

    void addReviews(Long CompanyId, Review review);

    boolean updateReview(Long CompanyId, Long ReviewId , Review review);

    Review getReviewsById(Long companyId, Long reviewId);

    boolean deleteReview(Long companyId, Long reviewId);
}
