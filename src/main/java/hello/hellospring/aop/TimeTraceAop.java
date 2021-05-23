package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TimeTraceAop {

    @Around("execution(* hello.hellospring..*(..))")
    public void execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("TimeTraceAop.execute" + joinPoint.toString());
        try {
            Object proceed = joinPoint.proceed();
        }finally{
            long finish = System.currentTimeMillis();
            long timeMs = finish-start;
            System.out.println("End : " + joinPoint.toString() + " " + timeMs + "ms");
        }
    }
}
