package com.syject.support.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.syject.support.android.presenters.IPresenter;
import com.syject.support.android.presenters.IPresenterCollection;
import com.syject.support.android.presenters.PresenterCollection;

/**
 * Created by maxim_000 on 22.10.2014.
 * Активность лежащая на вершине иерархии
 */
public class BaseActivity extends FragmentActivity implements IPresenterCollection {

    private final PresenterCollection presenterCollection;

    public BaseActivity() {
        presenterCollection = new PresenterCollection();
    }


    /* lifecycle */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenterCollection.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();

        presenterCollection.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        presenterCollection.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        presenterCollection.onSaveInstanceState(outState);
    }

    @Override
    protected void onPause() {
        super.onPause();

        presenterCollection.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();

        presenterCollection.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        presenterCollection.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
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
