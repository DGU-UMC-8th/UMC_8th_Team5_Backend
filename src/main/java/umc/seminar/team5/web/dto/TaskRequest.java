package umc.seminar.team5.web.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import umc.seminar.team5.domain.Status;

import java.time.LocalDateTime;

public class TaskRequest {
    @Getter
    public static class JoinRequest{
        @NotBlank
        Long Id;

        @NotBlank
        Long memberId;

        @NotBlank
        String title;

        @NotBlank
        LocalDateTime dueDate;

        @NotBlank
        String instruction;

        @Enumerated(EnumType.STRING)
        Status status;
    }
}
