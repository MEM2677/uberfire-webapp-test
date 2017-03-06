package org.uberfire.client.screens.mylovelyscreen;

import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.security.shared.api.identity.User;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.client.annotations.WorkbenchPartView;
import org.uberfire.client.annotations.WorkbenchScreen;
import org.uberfire.client.mvp.UberElement;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by matteo on 03/03/17.
 */
@WorkbenchScreen( identifier = "MyLovelyScreen" )
public class MyLovelyScreen {

    public interface View extends UberElement<MyLovelyScreen> {
        void setup(String username);
    }

//    @Inject
//    private Caller<org.uberfire.shared.EchoServiceImpl> echoService;
//
//    @Inject
//    private org.uberfire.impl.EchoServiceImpl echoServiceImpl;

    @Inject
    private View view;

    @Inject
    private User user;

    @PostConstruct
    public void setup() {
        view.init( this );
        view.setup( user.getIdentifier() );
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
