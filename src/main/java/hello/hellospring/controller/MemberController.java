package hello.hellospring.controller;

import hello.hellospring.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
//    private final MemberService memberService = new MemberService();


    //setter 주입
    //단점 : 조립다 끝났는데도 누가 이거 쓰는데 수정해버릴 수 있음; setMemberController public으로 열려있잖아.
    //private MemberService memberService;
    //@Autowired
    //public void setMemberController(MemberService memberService) {
    //  this.memberService = memberService;
    //    memberService.setMemberRepository();
    //}

    //필드주입
    //단점 : 조립할 때도 바꿀 수가 없다
    //@Autowired
    //private MemberService memberService;


    //생성자주입
    //추천!
    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
    this.memberService = memberService;
    }


}
