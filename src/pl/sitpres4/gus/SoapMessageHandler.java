package pl.sitpres4.gus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.sun.istack.internal.Nullable;

public class SoapMessageHandler implements SOAPHandler<SOAPMessageContext> {

//    private String sessionCookie = "";
    public static String sessionId = "";

    @Override
    public void close(MessageContext arg0) { }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Set getHeaders() {
        return null;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        if ((Boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
            // Add header to outbound request (set cookie in HTTP client header)
            // Set the SID
            Map<String, List<String>> headers = (Map<String, List<String>>)soapMessageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
            if (headers == null) {
                headers = new HashMap<String, List<String>>();
                soapMessageContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
            }
            List<String> sid = headers.get("sid");
            if (sid == null) {
                sid = new ArrayList<String>();
                headers.put("sid", sid);
            }
            sid.add(sessionId);
        } else {
            // Read header from request (read cookie from server's HTTP headers)
            Map<String, List<String>> map = (Map<String, List<String>>) soapMessageContext.get(MessageContext.HTTP_RESPONSE_HEADERS);
            List<String> contentType = getHTTPHeader(map, "Set-Cookie");
            // Note, only grabs last cookie value!
            // If you need to present more than one cookie you could make
            // sessionCookie a List<String> and modify this class accordingly.
            if (contentType != null) {
                StringBuffer strBuf = new StringBuffer();
                for (String type : contentType) {
                    strBuf.append(type);
                }
                sessionId = strBuf.toString();
            }
        }
        return true;
    }

    private @Nullable List<String> getHTTPHeader(Map<String, List<String>> headers, String header) {
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String name = entry.getKey();
            if (header != null && name !=null) {
                if (name.equalsIgnoreCase(header))
                    return entry.getValue();
            }
        }
        return null;
    }

}
