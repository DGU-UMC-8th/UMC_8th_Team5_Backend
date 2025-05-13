package umc.seminar.team5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.seminar.team5.domain.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
