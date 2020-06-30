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
    @POST("/owner/login")
    Call<LoginResponse> ownerLogin(@Body LoginData data);

    @POST("/owner/join")
    Call<JoinResponse> ownerJoin(@Body JoinData data);

    @POST("/owner/join_emailAvailable")
    Call<JoinAvailableResponse> ownerJoinAvailable(@Body JoinAvailable data);

    @POST("/owner/find_email")
    Call<FindEmailResponse> ownerFindEmail(@Body FindEmailData data);

    @POST("/owner/find_password")
    Call<FindPasswordResponse> ownerFindPassword(@Body FindPasswordData data);
}