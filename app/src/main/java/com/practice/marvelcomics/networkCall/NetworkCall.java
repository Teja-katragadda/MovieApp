package com.practice.marvelcomics.networkCall;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkCall {

    public static final String BASIC_URL = "https://simplifiedcoding.net/demos/";

    @Provides
    MarvelService providesRetrofitClientInstance() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASIC_URL)
                .build().create(MarvelService.class);
    }
}
