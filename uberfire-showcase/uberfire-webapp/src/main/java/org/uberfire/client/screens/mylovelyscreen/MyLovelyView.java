package org.uberfire.client.screens.mylovelyscreen;

import com.google.gwt.user.client.ui.TextBox;
import org.jboss.errai.common.client.dom.*;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.ForEvent;
import org.jboss.errai.ui.shared.api.annotations.Templated;
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

    @DataField("submit")
    private Button submit = (Button) Window.getDocument().createElement("submit");

    @Override
    public void setup(String username) {
        welcome.setInnerHTML("Welcome " + username + "!");
    }

    @Override
    public void init(MyLovelyScreen presenter) {
        this.presenter = presenter;
    }

    @EventHandler("submit")
    public void doSomething(@ForEvent("click") Event event) {
        logger.error("****");
        logger.error("**** " + echoField);
        logger.error("****");
    }
}
