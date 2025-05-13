package umc.seminar.team5.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.seminar.team5.domain.Member;
import umc.seminar.team5.domain.Task;
import umc.seminar.team5.service.MemberService;
import umc.seminar.team5.service.TaskService;
import umc.seminar.team5.web.dto.TaskRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tasks")
public class TaskRestController {

    private final TaskService taskService;
    private final MemberService memberService;

    @PostMapping
    public ApiResponse<TaskResponse.CreateResult> createTask(@Valid @RequestBody TaskRequest taskRequest) {
        Member member = memberService.findById(request.getMemberId());
        Task task = taskService.createTask(request, member);
    }
}