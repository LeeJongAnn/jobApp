package com.firstjob.jobapp.review;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {


    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


    @GetMapping
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long id) {

        List<Review> allReviews = reviewService.getAllReviews(id);
        return new ResponseEntity<>(allReviews, HttpStatus.OK);

    }

    @PostMapping("/reviews")
    public ResponseEntity<String> addReview(@PathVariable Long companyId, @RequestBody Review review) {

        reviewService.addReviews(companyId, review);
        return new ResponseEntity<>("Review added Successfully", HttpStatus.OK);
    }


    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable Long companyId, @PathVariable Long reviewId, @RequestBody Review review) {

        boolean isReviewUpdated = reviewService.updateReview(companyId, reviewId, review);

        if (isReviewUpdated)
            return new ResponseEntity<>("Review updated Successfully", HttpStatus.OK);
        else {
            return new ResponseEntity<>("Review not updated", HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> getReviewById(@PathVariable Long companyId, @PathVariable Long reviewId) {

        Review review = reviewService.getReviewsById(companyId, reviewId);
        return new ResponseEntity<>(review, HttpStatus.OK);

    }

    @DeleteMapping("/reviews/{reviewId}")
    public ResponseEntity<String> deleteRevivew(@PathVariable Long companyId, @PathVariable Long reviewId) {


        boolean isReviewDeleted = reviewService.deleteReview(companyId, reviewId);

        if (isReviewDeleted)
            return new ResponseEntity<>("Review deleted Successfully", HttpStatus.OK);
        else {
            return new ResponseEntity<>("Review not deleted", HttpStatus.NOT_FOUND);
        }
    }
}
