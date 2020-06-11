/***************************************************************************************************
 *   @클래스명  : SecuirtyConfig

 *   @패키지명  : com.zoo.homeport.config

 *   @설명     :

 *   @작성자    : Bear

 *   @작성일    : 2020. 4.  1.

 *   @변경이력  :

 *           이름     : 일자            : 근거자료      : 변경내용
 *           --------------------------------------------------------------------------------
 *
 ***************************************************************************************************/
package com.zoo.homeport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * Created by Bear.
 * User: RAU
 * Date: 2020-06-11
 * Time: 14:14
 * 설명:
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
                .authorizeRequests()
                .antMatchers("/**").permitAll();
            //.and()
                //.addFilterBefore()
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/swagger-resoureces/**");
    }
}
