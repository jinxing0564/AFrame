package com.vince.aframe.base.net.response;

/**
 * 所有response的基类
 * Created by tianweixin on 2016-7-27.
 */
public class BaseResponse {
    public String resultCode;    // "1000",
    public String resultMsg;     // "操作成功"
//    public T result;  //如果业务bean是Response的一个字段采用这种方式，否则业务bean直接继承BaseResponse
}