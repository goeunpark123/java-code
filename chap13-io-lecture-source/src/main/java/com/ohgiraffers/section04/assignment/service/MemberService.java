package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;

/*설명. 트랜잭션 성공 실패 여부 확인 및 회원 관련 비즈니스 로직 처리하는 클래스*/
public class MemberService {
    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void selectAllMembers() {
        ArrayList<Member> selectedMembers = mr.selectAllMembers();

        /*설명 .회원이 하나도 없는 경우에도 ArrayList 객체는 Empty 상태로 반환*/
        if(!selectedMembers.isEmpty()){             // selectedMembers 객체는 항상 생성되므로 null로 조건 작성 X
            System.out.println("===== 성공 =====");
            for (Member m : selectedMembers) System.out.println(m);
            return;                                 // 이후 코드와 상관 없이 메소드 종료
        }

        /*설명. else 사용 대신 if 조건에 해당하지 않는 경우에 출력*/
        System.out.println("회원 없음");
    }

    /*설명. 전달된 회원 번호를 활용해 repository에 있는 memberList로부터 해당 회원 찾아 반환*/
    public void selectMember(int memNo) {
        Member selectedMember = mr.selectMember(memNo);

        if(selectedMember == null) {
            System.out.println("X");
        } else {
            System.out.println(selectedMember);
        }
    }

    /*설명. 입력받아 넘어온 회원이 가질 번호를 만들고 추가 후 repository로 전달하고 결과 확인*/
    public void registerMember(Member member) {
//        System.out.println("Member 확인: " + member);

        int lastMemberNo = mr.selectLastMemberNo();
        member.setMemNo(lastMemberNo + 1);

        int result = mr.registMember(member);
        if(result == 1) System.out.println(member.getId() + "님의 회원 가입 성공!");
    }

    public void deleteMember(int memNo) {
        int result = mr.deleteMember(memNo);

        if(result > 0) {
            System.out.println(memNo + "번 회원 탈퇴 성공!");
            return;
        }

        System.out.println("회원 탈퇴 실패");
    }
}
