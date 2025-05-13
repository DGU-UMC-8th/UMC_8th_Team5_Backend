package umc.seminar.team5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.seminar.team5.domain.Review;
import umc.seminar.team5.domain.Task;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByTask(Task task);
}
