package com.syject.support.android.presenters;

/**
 * Created by maxim_000 on 24.02.2015.
 */
public interface IPresenterCollection {
    public <TPresenter extends IPresenter<TPresenterView>, TPresenterView>
        TPresenter registerPresenter(TPresenter presenter, TPresenterView presenterView);
}
