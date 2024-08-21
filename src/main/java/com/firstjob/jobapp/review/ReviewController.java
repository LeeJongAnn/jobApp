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


    @PutMapping
    public ResponseEntity<String> updateReview(@PathVariable Long companyId, @PathVariable Long reviewId, @RequestBody Review review) {


        return new ResponseEntity<>("Review updated Successfully", HttpStatus.OK);

    }
}
