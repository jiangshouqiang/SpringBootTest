package com.gr.jiang.controllerAdviceTest.exception;

/**
 * Created by jiang on 2017/10/24.
 */
public class TestException extends RuntimeException{

    private String msgCode;
    private String msgInfo;

    public TestException(String msgCode, String msgInfo) {
        this.msgCode = msgCode;
        this.msgInfo = msgInfo;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }
}
