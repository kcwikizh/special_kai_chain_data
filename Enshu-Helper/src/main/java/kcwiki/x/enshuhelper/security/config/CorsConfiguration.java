/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcwiki.x.enshuhelper.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author iHaru
 * https://www.jianshu.com/p/d05303d34222
 * http://www.ruanyifeng.com/blog/2016/04/cors.html
 * https://www.jianshu.com/p/af8360b83a9f
 */
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

        @Override
            //重写父类提供的跨域请求处理的接口
            public void addCorsMappings(CorsRegistry registry) {
//                添加映射路径
                registry.addMapping("/enshuhelper/**")
//                        .allowCredentials(true)
                        .allowedOrigins("http://127.0.0.1", "https://api.senka.com.ru", "http://api.senka.com.ru", null)
                        .allowedHeaders("*")
                        .allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "POST", "DELETE", "PATCH")
                        .exposedHeaders(HttpHeaders.LOCATION, "X-CSRF-TOKEN", "XSRF-TOKEN");
            }

}

