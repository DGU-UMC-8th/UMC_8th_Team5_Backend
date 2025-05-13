package umc.seminar.team5.web.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import umc.seminar.team5.domain.Status;

import java.time.LocalDateTime;

public class ReviewRequest {
    @Getter
    public static class JoinRequest{
        @NotBlank
        Long Id;

        @NotBlank
        Long MemberId;

        @NotBlank
        String title;

        @NotBlank
        LocalDateTime createdAt;

        @NotBlank
        String content;
    }
}
