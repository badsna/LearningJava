package com.example.springframework.ForAspect.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect  //aop configuration have to be done in xml
public class LoggingAspect {
    //whenever getName is called this aspect gets executed
    //@Before("execution( public String getName())")


    //whenever getName() of circle is  called
    //@Before("execution( public String com.example.springframework.ForAspect.model.Circle.getName())")

    //for all getters
    //@Before("execution( public String get*())")

    //for all return type
    //@Before("execution( public * getName())")

    //for 0 to n arguments
    //@Before("execution( public * get(..))")

    //only for circle
    //j vaya ne hunxa vanna ko lagi * lagaune
    @Before(value = "execution(* com.example.springframework.ForAspect.model.Circle.*(..))")
    public void LoggingAdvice(){
        System.out.println("Advice run.Get Method Called");
    }

    @Before(value = "allGetters()")
    public void secondAdvice(){
        System.out.println("Second Advice executed");
    }


    //pointcut is for all the point in the exectution of your code where you want to run
    //yess vitra lakhyako expression sab ma lakhnu pardaina just method as a value pass garya hunxa
    @Pointcut("execution( * get*())")
    public void allGetters(){}


    //Now i want to print get when get method called and set when set method is called
    @Pointcut("within(com.example.springframework.ForAspect.model.Circle)")
    public void allCircleMethods(){
    }

    //@Pointcut(args())
    @Before(value = "allCircleMethods()")
    //JointPoint have the information about  which method called this method
    public void LoggingAdvice1(JoinPoint joinPoint){

        System.out.println(joinPoint.toString());
        //print outs the object  that called
        System.out.println(joinPoint.getTarget());

    }

    //runs after the target method has completed its task
    @AfterReturning("args(name)")
    public void stringArgugmentMethods(String name){
        System.out.println("A method that takes string arguments has been called. The value is "+name);
    }

    @AfterThrowing("args(name)")
    public void exceptionAdvice(String name){
        System.out.println("An exception has been thrown");
    }

    @After(value ="execution( * com.example.springframework.ForAspect.model.Triangle.setName())" )
    public void triangle(){
        System.out.println("setter for after triangle");
    }

//    @Around("allGetters()")
//    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//        Object retun=null;
//        try {
//            System.out.println("before advice");
    //target method execution happens in this line of code
//          retun =proceedingJoinPoint.proceed();
//            System.out.println("after returing");
//        } catch (Throwable e) {
//            throw new RuntimeException("After throwing");
//        }
//        System.out.println("after finally");
//        return retun;
//    }

    @Around("@annotation(com.example.springframework.ForAspect.aspect.Loggable)")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object retun=null;
        try {
            System.out.println("before advice");
            retun =proceedingJoinPoint.proceed();
            System.out.println("after returing");
        } catch (Throwable e) {
            throw new RuntimeException("After throwing");
        }
        System.out.println("after finally");
        return retun;
    }

    //I want to call this method whenever i call getCircle
    //without using annotation,by hard cotting
    public void loggableAdvice(){
        System.out.println("logging from the advicee");
    }


    //for xml
//        @Around("allGetters()")
    public Object myAroundAdvices(ProceedingJoinPoint proceedingJoinPoint){
        Object retun=null;
        try {
            System.out.println("before advice");
   // target method execution happens in this line of code
          retun =proceedingJoinPoint.proceed();
            System.out.println("after returing");
        } catch (Throwable e) {
            throw new RuntimeException("After throwing");
        }
        System.out.println("after finally");
        return retun;
    }

}
