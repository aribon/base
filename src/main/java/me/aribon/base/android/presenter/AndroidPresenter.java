package me.aribon.base.android.presenter;

import me.aribon.base.android.view.AndroidMvpView;
import me.aribon.base.presenter.MvpPresenter;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public interface AndroidMvpPresenter<V extends AndroidMvpView> extends MvpPresenter<V> {

  void attachView(V view);

  void subscribe();

  void unsubscribe();

  void detachView();
}
