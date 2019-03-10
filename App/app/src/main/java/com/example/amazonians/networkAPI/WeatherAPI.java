package com.example.amazonians.networkAPI;

import com.example.amazonians.models.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherAPI {

    @GET("/current.json")
    Call<WeatherModel> getWeather(
            @Path("key") String apiKey,
            @Path("q") String coordinates
    );

}
