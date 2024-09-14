package com.feiniaojin.gracefulresponse.advice.lifecycle.exception;

import org.springframework.lang.Nullable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 接受异常的处理器
 *
 * @author qinyujie
 */
public interface BeforeControllerAdviceProcess {

    /**
     * ControllerAdvice处理前的回调
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     */
    void call(HttpServletRequest request, HttpServletResponse response, @Nullable Object handler, Exception ex);
}
