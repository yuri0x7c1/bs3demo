package com.github.yuri0x7c1.vaadin.bs3demo;


import org.gwtbootstrap3.client.ui.constants.ColumnSize;
import org.gwtbootstrap3.client.ui.constants.Styles;
import org.vaadin.viritin.button.MButton;
import org.vaadin.viritin.fields.MTextField;
import org.vaadin.viritin.layouts.MCssLayout;
import org.vaadin.viritin.v7.fields.MDateField;

import com.github.yuri0x7c1.vaadin.bs3demo.component.Col;
import com.github.yuri0x7c1.vaadin.bs3demo.component.Navbar;
import com.github.yuri0x7c1.vaadin.bs3demo.component.Row;
import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@JavaScript({
    "vaadin://js/jquery.min.js",
    "vaadin://js/bootstrap.min.js"
})
@Theme("mytheme")
@Widgetset("com.vaadin.v7.Vaadin7WidgetSet")
@SpringUI
public class MainUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		Navbar navbar = new Navbar()
			.withLink(new MButton("Link 1").withStyleName(ValoTheme.BUTTON_BORDERLESS))
			.withLink(new MButton("Link 2").withStyleName(ValoTheme.BUTTON_BORDERLESS + " active"));


		DateField df = new DateField("Date Field");
		df.setStyleName(Styles.FORM_CONTROL);

		MCssLayout container = new MCssLayout(
			new Row()
				.withCol(
					new Col(ColumnSize.SM_6.getCssName())
						.withComponent(new Label("col1"))
						.withComponent(
							new MCssLayout(
								new MTextField("Hello").withStyleName(Styles.FORM_CONTROL)
							).withStyleName(Styles.FORM_GROUP)
						)
						.withComponent(
							new MCssLayout(
								df
							).withStyleName(Styles.FORM_GROUP)
						)
						.withComponent(
							new MCssLayout(
								new ComboBox<>()
						).withStyleName(Styles.FORM_GROUP)
					)
				)
				.withCol(
					new Col(ColumnSize.SM_6.getCssName())
						.withComponent(new Label("col2"))
				)
		)
		.withStyleName(Styles.CONTAINER_FLUID).withFullWidth();




		MCssLayout mainLayout = new MCssLayout().withFullWidth().withComponents(
				navbar, container);
		setContent(mainLayout);
	}

}
