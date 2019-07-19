package com.practice.marvelcomics;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.practice.marvelcomics.databinding.MarvelItemBinding;

import java.util.ArrayList;
import java.util.List;

public class MarvelRecyclerViewAdapter extends RecyclerView.Adapter<MarvelRecyclerViewAdapter.ViewHolder> {

    private List<MarvelItemViewModel> marvelItemViewModel = new ArrayList<>();

    public MarvelRecyclerViewAdapter(List<MarvelItemViewModel> marvelItemViewModel) {
        this.marvelItemViewModel = marvelItemViewModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        MarvelItemBinding marvelItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.marvel_item, viewGroup, false);
        return new ViewHolder(marvelItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            viewHolder.marvelItemBinding.setItemViewModel(marvelItemViewModel.get(i));
            viewHolder.marvelItemBinding.executePendingBindings();

//        viewHolder.bind(marvelItemViewModel.get(i));
    }

    @Override
    public int getItemCount() {
        return marvelItemViewModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        MarvelItemBinding marvelItemBinding;

        public ViewHolder(MarvelItemBinding marvelItemBinding) {
            super(marvelItemBinding.getRoot());
            this.marvelItemBinding = marvelItemBinding;
        }
//        public void bind(MarvelItemViewModel marvelItemViewModel){
//            marvelItemBinding.setItemViewModel(marvelItemViewModel);
//            marvelItemBinding.executePendingBindings();
//        }
    }
}
