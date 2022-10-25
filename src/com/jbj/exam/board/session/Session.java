package com.jbj.exam.board.session;

import com.jbj.exam.board.dto.Member;

public class Session {
  public int loginedMemberId;
  public Member loginedMember;

  public Session(){
    loginedMemberId = -1;
  }
}
