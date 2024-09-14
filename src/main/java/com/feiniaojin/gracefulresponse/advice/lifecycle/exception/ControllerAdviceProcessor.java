package com.feiniaojin.gracefulresponse.advice.lifecycle.exception;

import com.feiniaojin.gracefulresponse.data.Response;
import org.springframework.lang.Nullable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 *
 * @author qinyujie
 */
public interface ControllerAdviceProcessor {

    /**
     * 异常处理
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    Response process(HttpServletRequest request, HttpServletResponse response, @Nullable Object handler, Exception ex);
}
