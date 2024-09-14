package com.feiniaojin.gracefulresponse.api;

import java.lang.annotation.*;

/**
 * 使用此注解直接返回controller属性, 不封装
 *
 * @author lihao3
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ExcludeFromGracefulResponse {
}
