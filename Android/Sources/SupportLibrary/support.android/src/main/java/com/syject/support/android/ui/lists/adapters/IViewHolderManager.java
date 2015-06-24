package com.syject.support.android.ui.lists.adapters;

import android.view.View;
import android.view.ViewGroup;

public interface IViewHolderManager {
	View getView(ViewGroup root, View convertView, Object item);
}
