package me.aribon.base.android.presenter;

import me.aribon.base.android.view.AndroidView;
import me.aribon.base.presenter.Presenter;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public interface AndroidPresenter<V extends AndroidView> extends Presenter<V> {

  void attachView(V view);

  void subscribe();

  void unsubscribe();

  void detachView();
}
