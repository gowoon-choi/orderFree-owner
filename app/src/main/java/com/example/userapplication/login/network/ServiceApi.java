package com.example.userapplication.login.network;

import com.example.userapplication.login.data.FindEmailData;
import com.example.userapplication.login.data.FindEmailResponse;
import com.example.userapplication.login.data.FindPasswordData;
import com.example.userapplication.login.data.FindPasswordResponse;
import com.example.userapplication.login.data.JoinAvailable;
import com.example.userapplication.login.data.JoinAvailableResponse;
import com.example.userapplication.login.data.JoinData;
import com.example.userapplication.login.data.JoinResponse;
import com.example.userapplication.login.data.LoginData;
import com.example.userapplication.login.data.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceApi {
    @POST("/user/login")
    Call<LoginResponse> userLogin(@Body LoginData data);

    @POST("/user/join")
    Call<JoinResponse> userJoin(@Body JoinData data);

    @POST("/user/join_emailAvailable")
    Call<JoinAvailableResponse> userJoinAvailable(@Body JoinAvailable data);

    @POST("/user/find_email")
    Call<FindEmailResponse> userFindEmail(@Body FindEmailData data);

    @POST("/user/find_password")
    Call<FindPasswordResponse> userFindPassword(@Body FindPasswordData data);
}