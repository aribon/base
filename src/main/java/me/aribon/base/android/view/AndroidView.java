package me.aribon.base.android.view;

import me.aribon.base.android.presenter.AndroidPresenter;
import me.aribon.base.view.View;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public interface AndroidView<P extends AndroidPresenter> extends View<P> {

  void setPresenter(P presenter);

  P getPresenter();
}
