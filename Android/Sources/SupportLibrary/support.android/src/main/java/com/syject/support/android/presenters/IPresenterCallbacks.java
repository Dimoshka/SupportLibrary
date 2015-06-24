package com.syject.support.android.presenters;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by maxim_000 on 24.02.2015.
 */
public interface IPresenterCallbacks {
    void onCreate(Bundle savedInstanceState);
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();
    void onSaveInstanceState(Bundle outState);

    boolean onActivityResult(int requestCode, int resultCode, Intent data);
}
