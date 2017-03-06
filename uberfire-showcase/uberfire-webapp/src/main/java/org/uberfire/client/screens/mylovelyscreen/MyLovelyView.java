package org.uberfire.client.screens.mylovelyscreen;

import org.jboss.errai.common.client.dom.Button;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.TextInput;
import org.jboss.errai.common.client.dom.Window;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by matteo on 03/03/17.
 */
@Templated
public class MyLovelyView implements MyLovelyScreen.View, IsElement {

    private MyLovelyScreen presenter;

    @Named( "h1" )
    @Inject
    @DataField
    private Heading welcome;

    // The name to reference in the template can also be specified manually

//    @Inject
//    @DataField
//    private TextInput echoField;
    
    // We can also choose to instantiate our own data fields. Injection is not required.

//    @DataField
//    private Button submit = (Button) Window.getDocument().createElement("button");


    @Override
    public void setup(String username) {
        welcome.setInnerHTML("Welcome " + username + "!");
    }

    @Override
    public void init(MyLovelyScreen presenter) {
        this.presenter = presenter;
    }
}
