package com.github.yuri0x7c1.vaadin.bs3demo.component;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomLayout;

public class NavbarLink extends CustomLayout {
	public NavbarLink(Button link) {
		super("navbar_link");
		addComponent(link, "link");
	}
}
