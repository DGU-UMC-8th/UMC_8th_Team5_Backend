package umc.seminar.team5.web.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import umc.seminar.team5.domain.Status;

import java.time.LocalDateTime;

public class ReviewRequest {
    @Getter
    public static class CreateRequest{
        @NotNull
        Long MemberId;

        @NotBlank
        String title;

        @NotNull
        LocalDateTime createdAt;

        @NotBlank
        String content;
    }
}
