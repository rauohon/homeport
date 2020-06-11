/***************************************************************************************************
 *   @클래스명  : ResponseType

 *   @패키지명  : com.zoo.homeport.common.type

 *   @설명     :

 *   @작성자    : Bear

 *   @작성일    : 2020. 4.  1.

 *   @변경이력  :

 *           이름     : 일자            : 근거자료      : 변경내용
 *           --------------------------------------------------------------------------------
 *
 ***************************************************************************************************/
package com.zoo.homeport.common.type;

/**
 * Created by Bear.
 * User: RAU
 * Date: 2020-06-11
 * Github: https://github.com/rauohon
 * 설명:
 */
public enum ResponseType {

    SUCCESS("200");

    String code;

    ResponseType(String code) {
        this.code = code;
    }

    public String code() {
        return this.code;
    }
}
