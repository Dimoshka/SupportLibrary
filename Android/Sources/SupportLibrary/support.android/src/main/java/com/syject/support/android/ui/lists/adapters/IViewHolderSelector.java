package com.syject.support.android.ui.lists.adapters;

public interface IViewHolderSelector {
	
	IViewHolderCreator getCreator(Object item);
	
}
