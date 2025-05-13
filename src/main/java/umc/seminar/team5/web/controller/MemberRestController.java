package umc.seminar.team5.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.seminar.team5.domain.Member;
import umc.seminar.team5.service.MemberService;
import umc.seminar.team5.web.dto.MemberRequest;
import umc.seminar.team5.web.dto.MemberResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping
    public MemberResponse.JoinResult addMember(@Valid @RequestBody MemberRequest.JoinRequest request) {
        Member member = memberService.JoinMember(request);
        MemberResponse.JoinResult response = MemberResponse.JoinResult.builder()
                .id(member.getId())
                .name(member.getName())
                .phone(member.getPhone())
                .mail(member.getEmail())
                .build();
        return response;
    }
}
