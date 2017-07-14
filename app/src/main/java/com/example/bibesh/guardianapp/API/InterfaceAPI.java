package com.example.bibesh.guardianapp.API;

import com.example.bibesh.guardianapp.Constant;
import com.example.bibesh.guardianapp.Model.Headline;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Bibesh on 7/14/17.
 */

public interface InterfaceAPI {
    @Headers({"Content-Type: application/json", "api-key: " + Constant.API_KEY})
    @GET("/search?football&show-fields=starRating,headline,thumbnail,short-url")
    Call<Headline> getHeadlines();
}
