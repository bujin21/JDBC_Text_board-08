package com.jbj.exam.board;

import com.jbj.exam.board.exception.SQLErrorException;

import java.sql.SQLException;

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