package pl.sitpres4.gus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class SoapHandlerResolver implements HandlerResolver {

    @SuppressWarnings("unchecked")
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add( new SoapMessageHandler() );
        return handlerChain;
    }
}
