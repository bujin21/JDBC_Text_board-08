package com.jbj.exam.board;

import com.jbj.exam.board.util.Util;

import java.util.Map;

public class Rq {
  private String url;
  private Map<String, String> params;
  private String urlPath;

  Rq(String url) {
    this.url = url;
    urlPath = Util.getUrlPathFromUrl(this.url);
    params = Util.getParamsFromUrl(this.url);
  }

  public void setCommand(String url) {
    urlPath = Util.getUrlPathFromUrl(url);
    params = Util.getParamsFromUrl(url);
  }

  public Map<String, String> getParams() {
    return params;
  }

  public int getIntParam(String paramsName, int defaultValue) {

    if ( params.containsKey(paramsName) == false ) {
      return defaultValue;
    }

    try {
      return Integer.parseInt(params.get(paramsName));
    }
    catch ( NumberFormatException e) {
      return defaultValue;
    }

  }

  public String getParam(String paramsName, String defaultValue) {

    if ( params.containsKey(paramsName) == false ) {
      return defaultValue;
    }

    try {
      return params.get(paramsName);
    }
    catch ( NumberFormatException e) {
      return defaultValue;
    }
  }

  public String getUrlPath() {
    return urlPath;
  }
}
