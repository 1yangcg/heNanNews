package com.example.henannews.base;

public class BasePresenter<V extends BaseView> {

    private V view;

    public void attachView(V view){
        this.view = view;
    }
    public void detachView(){
        this.view = null;
    }

}
