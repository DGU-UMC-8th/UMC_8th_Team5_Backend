package umc.seminar.team5.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class ScheduleResponse {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateResult{
        @Getter
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class JoinResult {
            private Long taskId;
            private String taskName;
            private Integer day;
            private Integer page;
        }
    }
}
