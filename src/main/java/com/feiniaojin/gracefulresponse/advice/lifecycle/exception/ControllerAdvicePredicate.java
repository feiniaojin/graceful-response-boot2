package com.feiniaojin.gracefulresponse.advice.lifecycle.exception;

import org.springframework.lang.Nullable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 处理之前需要判断是否需要处理
 *
 * @author qinyujie
 */
public interface ControllerAdvicePredicate {


    /**
     * 判断是否要处理
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    default boolean shouldApplyTo(HttpServletRequest request, HttpServletResponse response, @Nullable Object handler, Exception ex) {
        return true;
    }
}
