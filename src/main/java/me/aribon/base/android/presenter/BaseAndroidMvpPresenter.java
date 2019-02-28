package me.aribon.base.android.presenter;

import me.aribon.base.android.view.AndroidMvpView;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public class BaseAndroidMvpPresenter<V extends AndroidMvpView> implements AndroidMvpPresenter<V> {

  private V view;

  public BaseAndroidMvpPresenter(V view) {
    attachView(view);
  }

  @Override
  public void attachView(V view) {
    this.view = view;
    this.view.setPresenter(this);
  }

  @Override
  public void detachView() {
    this.view = null;
  }
}
