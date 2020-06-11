/***************************************************************************************************
 *   @클래스명  : H2ServerConfiguration

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

import org.h2.tools.Server;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.SQLException;

/**
 * Created by Bear.
 * User: RAU
 * Date: 2020-06-11
 * Github: https://github.com/rauohon
 * 설명:
 */
@Configuration
@Profile("dev")
public class H2ServerConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.hikari") // yml의 설정값을 Set한다.
    public Server dataSource() throws SQLException {
        Server h2Server = Server.createTcpServer().start();
        if (h2Server.isRunning(true)) {
            System.out.println("H2 server was started and is running.");
            return h2Server;
        } else {
            throw new RuntimeException("Could not start H2 server.");
        }
    }
}
