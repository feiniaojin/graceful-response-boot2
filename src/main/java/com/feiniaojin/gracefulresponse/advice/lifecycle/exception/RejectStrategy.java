package com.feiniaojin.gracefulresponse.advice.lifecycle.exception;

import org.springframework.lang.Nullable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拒绝策略，如果异常不匹配，拒绝处理的实现，默认为将异常抛出
 *
 * @author qinyujie
 */
public interface RejectStrategy {

    /**
     * 拒绝策略
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    Object call(HttpServletRequest request, HttpServletResponse response, @Nullable Object handler, Exception ex);
}
