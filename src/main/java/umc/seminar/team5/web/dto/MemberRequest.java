package umc.seminar.team5.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

public class MemberRequest {
    @Getter
    public static class JoinRequest{
        @NotBlank
        String name;

        @NotBlank
        @Email
        String mail;

        @Min(10)
        String phone;
    }
}