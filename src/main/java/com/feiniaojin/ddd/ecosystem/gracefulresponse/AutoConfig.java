package com.feiniaojin.ddd.ecosystem.gracefulresponse;


import com.feiniaojin.ddd.ecosystem.gracefulresponse.advice.GlobalExceptionAdvice;
import com.feiniaojin.ddd.ecosystem.gracefulresponse.advice.NotVoidResponseBodyAdvice;
import com.feiniaojin.ddd.ecosystem.gracefulresponse.advice.VoidResponseBodyAdvice;
import com.feiniaojin.ddd.ecosystem.gracefulresponse.api.ResponseFactory;
import com.feiniaojin.ddd.ecosystem.gracefulresponse.api.ResponseStatusFactory;
import com.feiniaojin.ddd.ecosystem.gracefulresponse.defaults.DefaultResponseFactory;
import com.feiniaojin.ddd.ecosystem.gracefulresponse.defaults.DefaultResponseStatusFactoryImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 全局返回值处理的自动配置.
 *
 * @author <a href="mailto:943868899@qq.com">Yujie</a>
 * @version 0.1
 * @since 0.1
 */
@Configuration
@EnableConfigurationProperties(GracefulResponseProperties.class)
public class AutoConfig {

    @Bean
    @ConditionalOnMissingBean(value = GlobalExceptionAdvice.class)
    public GlobalExceptionAdvice globalExceptionAdvice() {
        return new GlobalExceptionAdvice();
    }

    @Bean
    @ConditionalOnMissingBean(NotVoidResponseBodyAdvice.class)
    public NotVoidResponseBodyAdvice notVoidResponseBodyAdvice() {
        return new NotVoidResponseBodyAdvice();
    }

    @Bean
    @ConditionalOnMissingBean(VoidResponseBodyAdvice.class)
    public VoidResponseBodyAdvice voidResponseBodyAdvice() {
        return new VoidResponseBodyAdvice();
    }

    @Bean
    @ConditionalOnMissingBean(value = {ResponseFactory.class})
    public ResponseFactory responseBeanFactory() {
        return new DefaultResponseFactory();
    }

    @Bean
    @ConditionalOnMissingBean(value = {ResponseStatusFactory.class})
    public ResponseStatusFactory responseStatusFactory() {
        return new DefaultResponseStatusFactoryImpl();
    }

    @Bean
    public ExceptionAliasRegister exceptionAliasRegister() {
        return new ExceptionAliasRegister();
    }
}
