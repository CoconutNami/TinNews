package com.laioffer.tinnews.network;

import com.laioffer.tinnews.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//define protocol
public interface NewsApi {
    // baseurl/top-headlines?country=us, GET
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country);

    // baseurl/everything?q=tesla&pageSize=3
    @GET("everything")
    Call<NewsResponse> getEverything(
            @Query("q") String query, @Query("pageSize") int pageSize);

}
