package com.lvyuanji.learn.aspect;

import com.lvyuanji.learn.pojo.Goods;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/7/7 11:31
 */
@Aspect
@Component
public class ByAspect {


//    execution: For matching method execution join points. This is the primary pointcut designator to use when working with Spring AOP.
//
//    within: Limits matching to join points within certain types (the execution of a method declared within a matching type when using Spring AOP).
//
//    this: Limits matching to join points (the execution of methods when using Spring AOP) where the bean reference (Spring AOP proxy) is an instance of the given type.
//
//    target: Limits matching to join points (the execution of methods when using Spring AOP) where the target object (application object being proxied) is an instance of the given type.
//
//    args: Limits matching to join points (the execution of methods when using Spring AOP) where the arguments are instances of the given types.
//
//    @target: Limits matching to join points (the execution of methods when using Spring AOP) where the class of the executing object has an annotation of the given type.
//
//    @args: Limits matching to join points (the execution of methods when using Spring AOP) where the runtime type of the actual arguments passed have annotations of the given types.
//
//    @within: Limits matching to join points within types that have the given annotation (the execution of methods declared in types with the given annotation when using Spring AOP).
//
//    @annotation: Limits matching to join points where the subject of the join point (the method being run in Spring AOP) has the given annotation.

   /* @After("execution(* com.lvyuanji.learn.person.*.buy(..)) && bean(girl)")
    public void buyAfter(){
        System.out.println("我是切面，我被调用了！-》》》》》after");
    }*/
   /* @Before("execution(* com.lvyuanji.learn.person.*.buy(..))")
    public void buyBefore(){
        System.out.println("我是切面我被调用了-》》》》》before");
    }*/
    /*@Around("execution(* com.lvyuanji.learn.person.Boy.buy(..))")
    public void buyAround(ProceedingJoinPoint pj){
        System.out.println("我要开始准备买东西了！！！");
        try {
            pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("方法已经被我执行完成了！！！");
    }*/

   /* @Pointcut("execution(* com.lvyuanji.learn.person.*.buy(..))")
    public void point(){}
     @Before("point()")
    public void buyBefore(){
        System.out.println("我是切面我被调用了-》》》》》before");
    }*/

   //获取方法参数
   /* @Pointcut("execution(* com.lvyuanji.learn.person.*.buy(double)) && args(price)")
    public void point(double price) {
    }

    @Before("point(price)")
    public void buyBefore(double price) {
        System.out.println("我是切面我获取到了price参数-》》》》》"+price);
    }*/

   /* //获取方法参数方式一 能获取到参数拿不到方法属性名
    @Pointcut("execution(* com.lvyuanji.learn.person.*.buy(double)) && args(price)")
    public void point(double price) {
    }

    @Around("point(price)")
    public void buyBefore(ProceedingJoinPoint pj,double price) {
        Signature signature = pj.getSignature();
        Object[] args = pj.getArgs();
        for (Object arg : args) {
            System.out.println("我是切面我获取到了price参数-》》》》》"+arg.toString());
        }
    }*/

   //使用注解方式执行aop切面
    //1.定义注解
//   @Pointcut("@annotation(com.lvyuanji.learn.testannotation.TestAnnotation) && args(price)")
//   public void point(double price) {
//   }
//
//    @Around("point(price)")
//    public void buyBefore(double price) {
//       System.out.println("我是切面我获取到了price参数-》》》》》" + price);
//    }

    //使用注解方式执行aop切面
    //1.定义注解
//    @Pointcut("@annotation(com.lvyuanji.learn.testannotation.TestAnnotation) && args(goods)")
//    public void point(Goods goods) {
//    }
//
//    @Before("point(goods)")
//    public void buyBefore(Goods goods) {
//        System.out.println("我是切面我获取到了goods参数-》》》》》商品名" + goods.getName());
//    }
  /*  //使用注解方式执行aop切面
    //1.定义注解
    @Pointcut("@annotation(com.lvyuanji.learn.testannotation.TestAnnotation) && args(goods)")
    public void point(Goods goods) {
    }

    @After("point(goods)")
    public void buyBefore(Goods goods) {
        System.out.println("我是切面我获取到了goods参数-》》》》》商品名" + goods.getName());
    }*/


    //使用注解方式执行aop切面,通过ProceedingJoinPoint获取参数
    //1.定义注解
//    @Pointcut("@annotation(com.lvyuanji.learn.testannotation.TestAnnotation)")
//    public void point() {
//    }
//
//    @Around("point()")
//    public void buyBefore(ProceedingJoinPoint pj) throws Throwable {
//        Object[] objects = pj.getArgs();
//        for (Object object : objects) {
//            if(object instanceof Goods){
//                Goods goods = (Goods)object;
//                System.out.println("我是切面我获取到了goods参数-》》》》》商品名" + goods.getName());
//            }
//        }
//        pj.proceed();
//    }

    @Pointcut("@annotation(com.lvyuanji.learn.testannotation.TestAnnotation)")
    public void point() {
    }

    @Around("point()")
    public void buyBefore(ProceedingJoinPoint pj) throws Throwable {
        Object[] objects = pj.getArgs();
        for (Object object : objects) {
            if(object instanceof Goods){
                Goods goods = (Goods)object;
                System.out.println("我是切面我获取到了goods参数-》》》》》商品名" + goods.getName());
            }
        }
        pj.proceed();
    }

    //总结

}
