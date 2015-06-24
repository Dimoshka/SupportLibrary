package com.syject.support.android.presenters;

/**
 * Created by Максим on 30.10.2014.
 * Presenter lifecycle
 */
public interface IPresenter<TPresenterView> extends IPresenterCallbacks {
    void setView(TPresenterView view);
}
