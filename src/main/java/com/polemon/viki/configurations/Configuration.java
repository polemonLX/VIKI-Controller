package com.polemon.viki.configurations;

import com.polemon.viki.api.VikiApplication;
import com.polemon.viki.api.VikiConsumer;
import com.polemon.viki.commons.VikiException;
import com.polemon.viki.commons.communication.utils.Method;
import com.polemon.viki.handler.ExternalRequestHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Configuration of the controller.
 */
@Slf4j
public class Configuration {

    public boolean bootstrap() {
        try {
            VikiConsumer.registerSyncConsumer("/project/{service}/{}", Method.GET, Object.class, new ExternalRequestHandler());
            VikiApplication.start();
        } catch (VikiException e) {
            log.error("Error instantiating app: {}", e.getMessage(), e);
            System.exit(1);
        }

        return true;
    }
    
}
