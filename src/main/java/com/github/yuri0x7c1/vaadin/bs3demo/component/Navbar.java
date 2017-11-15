package com.github.yuri0x7c1.vaadin.bs3demo.component;

import org.gwtbootstrap3.client.ui.constants.Styles;
import org.vaadin.viritin.layouts.MCssLayout;

import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.CustomLayout;


public class Navbar extends CustomLayout {

	private CssLayout navbarNav = new MCssLayout().withStyleName(Styles.NAV + " " + Styles.NAVBAR_NAV);

	public Navbar() {
		super("navbar");
		addComponent(navbarNav, "navbar-nav");
	}

	public Navbar withLink(Button navbarLink) {
		navbarNav.addComponent(navbarLink);
		return this;
	}
}
