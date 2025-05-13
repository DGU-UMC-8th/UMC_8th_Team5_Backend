package umc.seminar.team5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.seminar.team5.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
