package com.jbj.exam.board.session;

import com.jbj.exam.board.dto.Member;

public class Session {
  public int loginedMemberId;
  public Member loginedMember;

  public Session(){
    loginedMemberId = -1;
  }

  public void logout() {
    loginedMemberId = -1;
    loginedMember = null;
  }

  public boolean logined() {
    return loginedMemberId != -1;
  }

  public void login(Member member) {
    loginedMemberId = member.id;
    loginedMember = member;
  }
}
