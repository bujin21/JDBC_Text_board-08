package com.jbj.exam.board.contoller;

import com.jbj.exam.board.Rq;

import java.sql.Connection;
import java.util.Scanner;

public abstract class Controller {

  protected Rq rq;
  protected Scanner sc;
  public Controller(Scanner sc, Rq rq) {
  }

  public void setScanner(Scanner sc, Rq rq) {
    this.sc = sc;
    this.rq = rq;
  }
}
