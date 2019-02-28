package me.aribon.base.android.view;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.aribon.base.android.base.BaseActivity;
import me.aribon.base.android.presenter.AndroidPresenter;
import me.aribon.base.exeption.PresenterInitializationException;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public abstract class BaseAndroidActivity<P extends AndroidPresenter> extends BaseActivity
    implements AndroidView<P> {

  private P mPresenter;

  @Override
  public void setPresenter(P presenter) {
    this.mPresenter = presenter;
  }

  @Override
  public P getPresenter() {
    return mPresenter;
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    initializePresenter();
    checkIfPresenterInitialized();
    super.onCreate(savedInstanceState);
  }

  public void initializePresenter() {

  }

  private void checkIfPresenterInitialized() {
    if (mPresenter == null) {
      throw new PresenterInitializationException();
    }
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    mPresenter.detachView();
  }
}
