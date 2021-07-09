package com.lvyuanji.errorbody;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/9 14:50
 */
public class MyErrorBody {
    public MyErrorBody(int value, String message) {
        this.value = value;
        this.message = message;
    }
    public int value;

    public String message;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
