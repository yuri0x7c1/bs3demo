package com.github.yuri0x7c1.vaadin.bs3demo.component;

import org.gwtbootstrap3.client.ui.constants.Styles;

import com.vaadin.ui.CssLayout;

public class Row extends CssLayout {

	public Row() {
		setStyleName(Styles.ROW);
	}

	public Row withCol(Col col) {
		addComponent(col);
		return this;
	}
}
