package umc.seminar.team5.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.seminar.team5.domain.Member;
import umc.seminar.team5.repository.MemberRepository;
import umc.seminar.team5.web.dto.MemberRequest;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Member JoinMember(MemberRequest.JoinRequest request){
        Member member = Member.builder()
                .name(request.getName())
                .email(request.getMail())
                .phone(request.getPhone())
                .build();

        return memberRepository.save(member);
    }
}