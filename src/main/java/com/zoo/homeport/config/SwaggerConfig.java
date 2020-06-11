/***************************************************************************************************
 *   @클래스명  : SwaggerConfig

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
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Bear.
 * User: RAU
 * Date: 2020-06-11
 * Github: https://github.com/rauohon
 * 설명:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket homeport_swagger() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("유저")
                .apiInfo(new ApiInfoBuilder().version("1.0").title("유저 API").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zoo.homeport"))
                .build();
    }
}
