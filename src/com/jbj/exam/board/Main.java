package com.jbj.exam.board;

import com.jbj.exam.board.exception.SQLErrorException;

public class Main {
  public static void main(String[] args) {
    try{
      new App().run();
    }
    catch (SQLErrorException e){
      System.err.println(e.getMessage());
      e.getOrigin().printStackTrace();
    }
  }
}