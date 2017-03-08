package org.uberfire.impl;

import org.apache.commons.lang3.StringUtils;
import org.jboss.errai.bus.server.annotations.Service;
import javax.enterprise.context.ApplicationScoped;

import org.uberfire.shared.EchoService;


/**
 * Created by matteo on 03/03/17.
 */
@Service
@ApplicationScoped
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(final String string) {
        String result = null;

        if (StringUtils.isNotBlank(string))
//        if (null != string
//                && !string.trim().equals(""))
        {
            result = string.toUpperCase();
        }
        return result;
    }
}
