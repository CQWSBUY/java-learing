package com.lvyuanji.exception;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/9 14:44
 */
public class MyException extends Exception {

    public int code;

    public String message;

    public MyException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
