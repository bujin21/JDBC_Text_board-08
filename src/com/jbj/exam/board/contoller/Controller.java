package com.jbj.exam.board.contoller;

import com.jbj.exam.board.Container;
import com.jbj.exam.board.Rq;

import java.util.Scanner;

public abstract class Controller {
  protected Scanner sc;

  protected Controller() {
    this.sc = Container.scanner;
  }
}
