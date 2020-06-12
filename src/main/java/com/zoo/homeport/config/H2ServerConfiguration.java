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

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.h2.tools.Server;
import org.hibernate.annotations.Filter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
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
    @ConfigurationProperties("spring.datasource.hikari")
    public DataSource dataSource() throws SQLException {
        Server.createTcpServer("-tcp",
                "-tcpAllowOthers",
                "-tcpPort",
                "9094",
                "-ifNotExists").start();

        return new com.zaxxer.hikari.HikariDataSource();
    }
}
