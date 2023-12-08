package com.nageoffer.shortlink.admin.config;

import com.nageoffer.shortlink.admin.common.biz.user.UserTransmitFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @ClassName UserConfiguration
 * @Description 用户配置自动装配
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/12/07
 */
@Configuration
public class UserConfiguration {

    /**
     * 用户信息传递过滤器
     */
    @Bean
    public FilterRegistrationBean<UserTransmitFilter> globalUserTransmitFilter(StringRedisTemplate stringRedisTemplate) {
        FilterRegistrationBean<UserTransmitFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new UserTransmitFilter(stringRedisTemplate));
        registration.addUrlPatterns("/*");
        registration.setOrder(0);
        return registration;
    }

//    /**
//     * 用户操作流量风控过滤器
//     */
//    @Bean
//    @ConditionalOnProperty(name = "short-link.flow-limit.enable", havingValue = "true")
//    public FilterRegistrationBean<UserFlowRiskControlFilter> globalUserFlowRiskControlFilter(
//            StringRedisTemplate stringRedisTemplate,
//            UserFlowRiskControlConfiguration userFlowRiskControlConfiguration) {
//        FilterRegistrationBean<UserFlowRiskControlFilter> registration = new FilterRegistrationBean<>();
//        registration.setFilter(new UserFlowRiskControlFilter(stringRedisTemplate, userFlowRiskControlConfiguration));
//        registration.addUrlPatterns("/*");
//        registration.setOrder(10);
//        return registration;
//    }
}