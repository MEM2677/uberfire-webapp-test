package org.uberfire.client.screens.mylovelyscreen;

import com.google.gwt.user.client.ui.TextBox;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.dom.Button;
import org.jboss.errai.common.client.dom.Event;
import org.jboss.errai.security.shared.api.identity.User;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.client.annotations.WorkbenchPartView;
import org.uberfire.client.annotations.WorkbenchScreen;
import org.uberfire.client.mvp.UberElement;
import org.uberfire.shared.EchoService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Created by matteo on 03/03/17.
 */
@WorkbenchScreen( identifier = "MyLovelyScreen" )
public class MyLovelyScreen {

    private static final Logger logger = LoggerFactory.getLogger(MyLovelyScreen.class);

    public interface View extends UberElement<MyLovelyScreen> {
        void setup(String username);
    }

    @Inject
    private Caller<EchoService> echoService;

    @Inject
    private View view;

    @Inject
    private User user;


    @PostConstruct
    public void setup() {
        view.init( this );
        view.setup( user.getIdentifier() );
        logger.info("!!!");
        logger.info("!!!");
        logger.info("!!!");
    }

    @WorkbenchPartTitle
    public String getTitle() {
        return "My Lovely Screen";
    }

    @WorkbenchPartView
    public UberElement<MyLovelyScreen> getView() {
        return view;
    }
}
