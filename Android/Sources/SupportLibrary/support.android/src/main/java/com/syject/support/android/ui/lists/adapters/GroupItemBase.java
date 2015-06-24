package com.syject.support.android.ui.lists.adapters;

import java.util.ArrayList;
import java.util.List;

public abstract class GroupItemBase {
	public final List<Object> items;
	
	public GroupItemBase() {
		items = new ArrayList<Object>();
	}
}
