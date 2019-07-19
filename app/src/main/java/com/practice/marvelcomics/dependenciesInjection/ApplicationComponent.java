package com.practice.marvelcomics.dependenciesInjection;

import com.practice.marvelcomics.networkCall.NetworkCall;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


@Component(modules = {NetworkCall.class, AndroidSupportInjectionModule.class,ActivityBuilderModle.class})
public interface ApplicationComponent extends AndroidInjector<BasicApplication> {
}
