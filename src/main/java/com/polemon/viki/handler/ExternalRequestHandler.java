package com.polemon.viki.handler;

import com.polemon.viki.commons.communication.models.Event;
import com.polemon.viki.commons.communication.utils.IVikiCommunicationConsumerHandler;

/**
 *
 */
public class ExternalRequestHandler implements IVikiCommunicationConsumerHandler {

    @Override
    public Event execute(Event event) {
        System.out.println("CHEGOU");
        return new Event("", "", "Cenas");
    }

}
