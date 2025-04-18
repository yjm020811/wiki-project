package com.example.demo.aspect;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class LogAspect {
    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);
    @Before("execution(* com.example.demo.controller.*.*(..))")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
    }
    @AfterReturning(returning = "ret", pointcut = "execution(* com.example.demo.controller.*.*(..))")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
    }
    @AfterThrowing(pointcut = "execution(* com.example.demo.controller.*.*(..))", throwing = "ex")
    public void doAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        // 处理完请求，返回内容
        logger.info("异常：" + ex);
    }
    @Around("execution(* com.example.demo.controller.*.*(..))")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        // 执行方法
        Object ob = pjp.proceed();
        logger.info("耗时：" + (System.currentTimeMillis() - startTime));
        return ob;
    }
}
