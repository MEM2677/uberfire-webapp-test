package org.uberfire.shared;

import org.jboss.errai.bus.server.annotations.Remote;

/**
 * Created by matteo on 03/03/17.
 */
@Remote
public interface EchoService {

    String echo(final String string);

}
