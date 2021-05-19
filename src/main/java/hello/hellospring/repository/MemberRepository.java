package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    //Optional은.. null 값 처리 하는 방법... java8에 들어가 있는 기능
    List<Member> findAll();

}
