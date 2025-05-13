package umc.seminar.team5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.seminar.team5.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
