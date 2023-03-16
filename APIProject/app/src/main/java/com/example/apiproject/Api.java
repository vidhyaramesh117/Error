package com.example.apiproject;

import okhttp3.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call getRoles();
}
