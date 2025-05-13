package umc.seminar.team5.web.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import umc.seminar.team5.domain.Status;

import java.time.LocalDateTime;

public class TaskRequest {
    @Getter
    public static class CreateRequest{
        @NotNull
        Long memberId;

        @NotBlank
        String title;

        @NotNull
        LocalDateTime dueDate;

        @NotNull
        String instruction;
    }
}
