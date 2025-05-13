package umc.seminar.team5.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.seminar.team5.domain.Review;
import umc.seminar.team5.domain.Task;
import umc.seminar.team5.service.ReviewService;
import umc.seminar.team5.service.TaskService;
import umc.seminar.team5.web.dto.ReviewRequest;
import umc.seminar.team5.web.dto.ReviewResponse;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tasks/{taskId}/reviews")
public class ReviewRestController {
    private final ReviewService reviewService;
    private final TaskService taskService;

    @PostMapping
    public ReviewResponse.CreateResult createReview(@PathVariable Long taskId, @RequestBody ReviewRequest.CreateRequest request){
        Task task = taskService.findById(taskId);
        Review review = reviewService.createReview(request, task);
        return ReviewResponse.CreateResult.builder()
                .title(review.getTitle())
                .content(review.getContent())
                .createdAt(review.getCreatedAt())
                .build();
    }

    @GetMapping
    public List<ReviewResponse.CreateResult> getReviews(@PathVariable Long taskId){
        Task task = taskService.findById(taskId);
        List<Review> reviews = reviewService.getAllReviewsByTask(task);

        List<ReviewResponse.CreateResult> response = reviews.stream()
                .map(review -> {
                    // Review 객체에서 CreateResult 객체로 변환
                    return new ReviewResponse.CreateResult(
                            review.getTitle(),
                            review.getCreatedAt(),
                            review.getContent()
                    );
                })
                .collect(Collectors.toList());
        return response;
    }
}
