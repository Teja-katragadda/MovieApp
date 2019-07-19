package com.practice.marvelcomics.networkCall;

import com.google.gson.annotations.SerializedName;
import com.practice.marvelcomics.models.MarvelList;
import com.practice.marvelcomics.models.MarvelModel;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MarvelService {

    @GET("marvel")
    Observable<MarvelModel> getInfo();

}

