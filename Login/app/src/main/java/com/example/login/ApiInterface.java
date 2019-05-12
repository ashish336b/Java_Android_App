package com.example.login;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("register.php")
    Call<User> performRegistratoin(@Query("name") String Name, @Query("username") String UserName, @Query("user_password") String userPassword);

    @GET("login.php")
    Call<User> performUserLogin(@Query("username") String UserName, @Query("user_password") String userPassword);
}
