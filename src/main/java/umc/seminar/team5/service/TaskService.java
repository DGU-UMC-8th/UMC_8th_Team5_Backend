package umc.seminar.team5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.seminar.team5.domain.Member;
import umc.seminar.team5.domain.Status;
import umc.seminar.team5.domain.Task;
import umc.seminar.team5.repository.TaskRepository;
import umc.seminar.team5.web.dto.TaskRequest;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task createTask(TaskRequest.CreateRequest request, Member member) {
        Task task = Task.builder()
                .title(request.getTitle())
                .dueDate(request.getDueDate())
                .instruction(request.getInstruction)
                .status(Status.INCOMPLETE)
                .member(member)
                .build();

        return taskRepository.save(task);
    }
}