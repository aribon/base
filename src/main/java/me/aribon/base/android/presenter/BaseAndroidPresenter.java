package me.aribon.base.android.presenter;

import me.aribon.base.android.view.AndroidView;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public class BaseAndroidPresenter<V extends AndroidView> implements AndroidPresenter<V> {

  private V view;

  public BaseAndroidPresenter(V view) {
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
