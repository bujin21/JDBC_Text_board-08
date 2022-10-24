package com.jbj.exam.board;

import com.jbj.exam.board.contoller.ArticleController;
import com.jbj.exam.board.contoller.MemberController;
import com.jbj.exam.board.dao.ArticleDao;
import com.jbj.exam.board.dao.MemberDao;
import com.jbj.exam.board.dto.Member;
import com.jbj.exam.board.service.ArticleService;
import com.jbj.exam.board.service.MemberService;
import com.jbj.exam.board.session.Session;


import java.sql.Connection;
import java.util.Scanner;

public class Container {
  public static ArticleController articleController;
  public static MemberController memberController;

  public static ArticleService articleService;
  public static MemberService memberService;

  public static ArticleDao articleDao;
  public static MemberDao memberDao;
  public static Session session;
  public static Scanner scanner;
  public static Connection conn;

  public static void init(){
    session = new Session();

    articleDao = new ArticleDao();
    memberDao = new MemberDao();

    articleService = new ArticleService();
    memberService = new MemberService();

    articleController = new ArticleController();
    memberController = new MemberController();

  }
}
