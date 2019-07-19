package com.practice.marvelcomics;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.practice.marvelcomics.models.MarvelList;
import com.practice.marvelcomics.models.MarvelModel;
import com.practice.marvelcomics.networkCall.MarvelServiceManager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class MarvelViewModel implements LifecycleObserver {

    public MarvelServiceManager marvelServiceManager;
    private List<MarvelItemViewModel> marvelItemViewModelArrayList = new ArrayList<>();
    public MarvelRecyclerViewAdapter marvelRecyclerViewAdapter = new MarvelRecyclerViewAdapter(marvelItemViewModelArrayList);

    @Inject
    public MarvelViewModel(MarvelServiceManager marvelServiceManager) {
        this.marvelServiceManager = marvelServiceManager;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void getMarvelData() {

        getMarvelInfo();

    }

    private void getMarvelInfo() {
        marvelServiceManager.getInfo().subscribe(this::bindViews, this::failure);


    }

    private void failure(Throwable throwable) {
        Log.d(TAG, "failure: ");
    }

    private void bindViews(MarvelList marvelModels) {

        /*for(int i=0; i<marvelModels.size();i++) {
            MarvelModel temp = marvelModels.get(i);
            MarvelItemViewModel marvelItemViewModel = new MarvelItemViewModel();
            marvelItemViewModel.setName(temp.getName());
            marvelItemViewModel.setPublisher(temp.getPublisher());
            marvelItemViewModel.setRealname(temp.getRealname());
            marvelItemViewModel.setTeam(temp.getTeam());

            marvelItemViewModelArrayList.add(marvelItemViewModel);
            marvelRecyclerViewAdapter.notifyDataSetChanged();


        }*/


    }


}
