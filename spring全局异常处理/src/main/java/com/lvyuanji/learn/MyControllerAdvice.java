package com.lvyuanji.learn;

import com.lvyuanji.errorbody.MyErrorBody;
import com.lvyuanji.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/9 14:42
 */
@ControllerAdvice(basePackageClasses = TestError.class)
public class MyControllerAdvice {
    @ResponseBody
    @ExceptionHandler(MyException.class)
    public MyErrorBody handleControllerException(HttpServletRequest request, MyException exception) {
       MyErrorBody myErrorBody = new MyErrorBody(exception.getCode(),exception.getMessage());
       return myErrorBody;
    }

    @ResponseBody
    @ExceptionHandler({Exception.class})
    public MyErrorBody handleOtherException(HttpServletRequest request, Exception exception){
        MyErrorBody myErrorBody = new MyErrorBody(-1,exception.getMessage());
        return myErrorBody;
    }
}
