package umc.seminar.team5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.seminar.team5.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
