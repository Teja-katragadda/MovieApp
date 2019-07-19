package com.practice.marvelcomics.dependenciesInjection;

import com.practice.marvelcomics.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModle {

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
