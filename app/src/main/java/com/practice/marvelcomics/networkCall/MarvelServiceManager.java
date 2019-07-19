package com.practice.marvelcomics.networkCall;

import com.practice.marvelcomics.models.MarvelList;
import com.practice.marvelcomics.models.MarvelModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MarvelServiceManager {

    MarvelService marvelService;

    @Inject
    public MarvelServiceManager(MarvelService marvelService) {
        this.marvelService = marvelService;
    }

    public Observable<MarvelModel> getInfo() {
        return marvelService.getInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());

    }

}
