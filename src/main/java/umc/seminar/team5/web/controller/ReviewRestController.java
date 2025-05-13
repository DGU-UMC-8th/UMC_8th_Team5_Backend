package umc.seminar.team5.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.seminar.team5.apiPayload.ApiResponse;
import umc.seminar.team5.service.ReviewService;
import umc.seminar.team5.web.dto.ReviewResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tasks/{taskId}/reviews")
public class ReviewRestController {
    private final ReviewService reviewService;

    @PostMapping
    public ApiResponse<ReviewResponse.CreateResult> createReview(@PathVariable Long taskId, @RequestBody ReviewRequest.CreateRequeest request){

    }
}
