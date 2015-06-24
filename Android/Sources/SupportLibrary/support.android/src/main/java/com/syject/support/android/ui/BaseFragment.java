package com.syject.support.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.syject.support.android.presenters.IPresenter;
import com.syject.support.android.presenters.IPresenterCollection;
import com.syject.support.android.presenters.PresenterCollection;

/**
 * Created by maxim_000 on 22.10.2014.
 * Все фрагменты в программе должны наследовать этот класс
 */
public class BaseFragment extends Fragment implements IPresenterCollection {

    private final PresenterCollection presenterCollection;

    public BaseFragment() {
        presenterCollection = new PresenterCollection();
    }


    /* lifecycle */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenterCollection.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();

        presenterCollection.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();

        presenterCollection.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        presenterCollection.onSaveInstanceState(outState);
    }

    @Override
    public void onPause() {
        super.onPause();

        presenterCollection.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();

        presenterCollection.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        presenterCollection.onDestroy();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(presenterCollection.onActivityResult(requestCode, resultCode, data))
            return;

        super.onActivityResult(requestCode, resultCode, data);
    }


    /* public methods */

    @Override
    public <TPresenter extends IPresenter<TPresenterView>, TPresenterView>
    TPresenter registerPresenter(TPresenter presenter, TPresenterView presenterView) {
        return presenterCollection.registerPresenter(presenter, presenterView);
    }

}
