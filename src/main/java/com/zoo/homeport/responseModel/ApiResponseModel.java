/***************************************************************************************************
 *   @클래스명  : ApiResponseModel

 *   @패키지명  : com.zoo.homeport.model

 *   @설명     :

 *   @작성자    : Bear

 *   @작성일    : 2020. 4.  1.

 *   @변경이력  :

 *           이름     : 일자            : 근거자료      : 변경내용
 *           --------------------------------------------------------------------------------
 *
 ***************************************************************************************************/
package com.zoo.homeport.responseModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Created by Bear.
 * User: RAU
 * Date: 2020-06-11
 * Github: https://github.com/rauohon
 * 설명:
 */
@Data
@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class ApiResponseModel<T> {
    String status;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    T result;
}
