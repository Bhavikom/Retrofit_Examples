package com.journaldev.retrofitintro;

import com.journaldev.retrofitintro.pojo.MultipleResource;
import com.journaldev.retrofitintro.pojo.User;
import com.journaldev.retrofitintro.pojo.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by anupamchugh on 09/01/17.
 */

interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource> callGetRequest();

    @POST("/api/users")
    Call<User> callPostRequest(@Body User user);

    @GET("/api/users?")
    Call<UserList> callGetWithParameter(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> callMultipart(@Field("name") String name, @Field("job") String job);
}
