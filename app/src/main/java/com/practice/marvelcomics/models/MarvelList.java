package com.practice.marvelcomics.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MarvelList {

    @SerializedName("data")
    private List<MarvelModel> marvelModelList;

}
