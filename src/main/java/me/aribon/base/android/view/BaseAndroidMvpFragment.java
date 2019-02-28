package me.aribon.base.android.view;

import android.content.Context;

import me.aribon.base.android.base.BaseFragment;
import me.aribon.base.android.presenter.AndroidMvpPresenter;
import me.aribon.base.exeption.PresenterInitializationException;

/**
 * @Author: aribon
 * @Date: 24/03/2018
 */

public abstract class BaseAndroidMvpFragment<P extends AndroidMvpPresenter> extends BaseFragment
    implements AndroidMvpView<P> {

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
  public void onAttach(Context context) {
    super.onAttach(context);
    initializePresenter();
    checkIfPresenterInitialized();
  }

  private void checkIfPresenterInitialized() {
    if (mPresenter == null) {
      throw new PresenterInitializationException();
    }
  }

  @Override
  public void onDetach() {
    mPresenter.detachView();
    super.onDetach();
  }
}
