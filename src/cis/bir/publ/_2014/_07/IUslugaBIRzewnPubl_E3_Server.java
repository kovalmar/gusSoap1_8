
package cis.bir.publ._2014._07;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-06T19:36:04.034+01:00
 * Generated source version: 3.2.7
 *
 */

public class IUslugaBIRzewnPubl_E3_Server{

    protected IUslugaBIRzewnPubl_E3_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new E3Impl();
        String address = "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/UslugaBIRzewnPubl.svc";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new IUslugaBIRzewnPubl_E3_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
