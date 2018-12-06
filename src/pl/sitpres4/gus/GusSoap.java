package pl.sitpres4.gus;

import cis.bir.publ._2014._07.IUslugaBIRzewnPubl;
import cis.bir.publ._2014._07.datacontract.*;
import org.tempuri.UslugaBIRzewnPubl;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.soap.AddressingFeature;

public class GusSoap {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Podaj numer NIP");
        } else {
            String nrNip = args[0];
            System.out.println(nrNip);

            UslugaBIRzewnPubl service = new UslugaBIRzewnPubl();
            service.setHandlerResolver(new SoapHandlerResolver()); //<- doklejanie SID'a do HTTP HEADER
            IUslugaBIRzewnPubl port = service.getE3(new AddressingFeature());
            String statusUslugi = "StatusUslugi";
            String result = port.getValue(statusUslugi);
            System.out.println("StatusSesji = " + port.getValue("StatusSesji"));
// logowanie, jezeli sesja wygasla, badx logowanie pierwszy raz
            if ((SoapMessageHandler.sessionId.equals("")) || (! result.equals("1"))){
                String sid = port.zaloguj("abcde12345abcde12345");
                SoapMessageHandler.sessionId = sid;
            }
            System.out.println("StatusSesji = " + port.getValue("StatusSesji"));
// przykład wyszukiwania po NIPie
            ObjectFactory objectFactory = new ObjectFactory();
            JAXBElement<String> nipParam = objectFactory.createParametryWyszukiwaniaNip(nrNip);
            ParametryWyszukiwania parametryWyszukiwania = new ParametryWyszukiwania();
            parametryWyszukiwania.setNip(nipParam);
            String raport = port.daneSzukaj(parametryWyszukiwania);
            System.out.println(raport);
            System.out.println("StanDanych = " + port.getValue("StanDanych"));
            System.out.println("KomunikatKod = " + port.getValue("KomunikatKod"));
            System.out.println("KomunikatTresc = " + port.getValue("KomunikatTresc"));
            System.out.println("StatusSesji = " + port.getValue("StatusSesji"));
            System.out.println("StatusUslugi = " + port.getValue("StatusUslugi"));
            System.out.println("KomunikatUslugi = " + port.getValue("KomunikatUslugi"));
            Boolean logout = port.wyloguj(SoapMessageHandler.sessionId);
            System.out.println(logout);
        }
    }
}
