package umc.seminar.team5.web.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.seminar.team5.domain.Status;

import java.time.LocalDateTime;

public class TaskResponse {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateResult {
        private Long Id;
        private Long MemberId;
        private String title;
        private LocalDateTime dueDate;
        private String instruction;
        private Status status;
    }
}
