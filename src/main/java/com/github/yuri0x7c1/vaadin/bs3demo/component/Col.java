package com.github.yuri0x7c1.vaadin.bs3demo.component;

import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;

public class Col extends CssLayout {

	public Col(String cssClass) {
		setStyleName(cssClass);
	}

	public Col withComponent(Component c) {
		addComponent(c);
		return this;
	}
}
