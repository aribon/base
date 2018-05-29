package me.aribon.base.android.view;

import me.aribon.base.android.presenter.AndroidMvpPresenter;
import me.aribon.base.view.MvpView;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public interface AndroidMvpView<P extends AndroidMvpPresenter> extends MvpView<P> {

  void setMvpPresenter(P mvpPresenter);

  P getMvpPresenter();
}
