/***************************************************************************************************
 *   @클래스명  : HomeController

 *   @패키지명  : com.zoo.homeport.controller

 *   @설명     :

 *   @작성자    : Bear

 *   @작성일    : 2020. 4.  1.

 *   @변경이력  :

 *           이름     : 일자            : 근거자료      : 변경내용
 *           --------------------------------------------------------------------------------
 *
 ***************************************************************************************************/
package com.zoo.homeport.homeController;

import com.zoo.homeport.common.type.ResponseType;
import com.zoo.homeport.responseModel.ApiResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bear.
 * User: RAU
 * Date: 2020-06-11
 * Github: https://github.com/rauohon
 * 설명:
 */
@Slf4j
@RestController
public class HomeController {

    @GetMapping("/")
    public ApiResponseModel<String> hellowWorld() {
        System.out.println(">>>>>>>>>>>>>>>>>>>> helloWorld");
        log.debug(">>>>>>>>>>>>dddddddd");
        ApiResponseModel<String> apiResponseModel =
                new ApiResponseModel<String>()
                .setStatus(ResponseType.SUCCESS.code())
                .setResult("서엉공");

        return apiResponseModel;
    }
}
