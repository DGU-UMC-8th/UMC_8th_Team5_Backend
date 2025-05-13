package umc.seminar.team5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.seminar.team5.domain.Review;
import umc.seminar.team5.domain.Task;
import umc.seminar.team5.repository.ReviewRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public Review createReview(ReviewRequest.CreateRequest request, Task task) {
        Review review = Review.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .createdAt(LocalDateTime.now())
                .task(task)
                .build();

        return reviewRepository.save(review);
    }


}