package com.vince.andframe.base.net.protocol;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.vince.andframe.base.net.response.listener.ResponseFailureListener;
import com.vince.andframe.base.net.response.listener.ResponseSuccessListener;

import org.json.JSONObject;

/**
 * Created by tianweixin on 2016-7-26.
 */
public class AFJsonRequest extends JsonObjectRequest {
    private ResponseSuccessListener successListener;
    private ResponseFailureListener failureListener;

    public AFJsonRequest(int method, String url, String requestBody, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(method, url, requestBody, listener, errorListener);
        successListener = (ResponseSuccessListener) listener;
        failureListener = (ResponseFailureListener) errorListener;
    }

    @Override
    public void cancel(){
        if (successListener != null) {
            successListener.cancel();
        }
        if (failureListener != null) {
            failureListener.cancel();
        }
        super.cancel();
    }

}
