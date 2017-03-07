package org.uberfire.client.screens.mylovelyscreen;

import com.google.gwt.event.dom.client.ClickEvent;
import org.gwtbootstrap3.client.ui.Button;
//import org.gwtbootstrap3.client.ui.Heading;
import org.gwtbootstrap3.client.ui.TextBox;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.shared.api.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by matteo on 03/03/17.
 */
@Templated
public class MyLovelyView implements MyLovelyScreen.View, IsElement {

    private static final Logger logger = LoggerFactory.getLogger(MyLovelyView.class);

    private MyLovelyScreen presenter;

    @Named( "h1" )
    @Inject
    @DataField
    private Heading welcome;

    // The name to reference in the template can also be specified manually
    @Inject
    @DataField
    private TextBox echoField;

    // We can also choose to instantiate our own data fields. Injection is not required.

    @Inject
    @DataField("submit")
//    private Button submit = (Button) Window.getDocument().createElement("submit");
    private Button submit;

    @Override
    public void setup(String username) {
        welcome.setInnerHTML("Welcome " + username + "!");
        //welcome.setText("Welcome " + username + "!");
    }

    @Override
    public void init(MyLovelyScreen presenter) {
        this.presenter = presenter;
    }

    @EventHandler("submit")
    public void submit(final ClickEvent event) {
        logger.error("****");
        logger.error("****");
        logger.error("****");
        welcome.setInnerHTML("WOW!");
        //welcome.setText("GOTCHA!");
    }
}
