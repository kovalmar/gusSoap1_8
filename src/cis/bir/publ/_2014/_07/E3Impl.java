
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cis.bir.publ._2014._07;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2018-12-06T19:36:04.003+01:00
 * Generated source version: 3.2.7
 *
 */

@javax.jws.WebService(
                      serviceName = "UslugaBIRzewnPubl",
                      portName = "e3",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/wsdl/UslugaBIRzewnPubl.xsd",
                      endpointInterface = "cis.bir.publ._2014._07.IUslugaBIRzewnPubl")

public class E3Impl implements IUslugaBIRzewnPubl {

    private static final Logger LOG = Logger.getLogger(E3Impl.class.getName());

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#setValue(java.lang.String pNazwaParametru, java.lang.String pWartoscParametru)*
     */
    public java.lang.String setValue(java.lang.String pNazwaParametru, java.lang.String pWartoscParametru) {
        LOG.info("Executing operation setValue");
        System.out.println(pNazwaParametru);
        System.out.println(pWartoscParametru);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#daneSzukaj(cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania pParametryWyszukiwania)*
     */
    public java.lang.String daneSzukaj(cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania pParametryWyszukiwania) {
        LOG.info("Executing operation daneSzukaj");
        System.out.println(pParametryWyszukiwania);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#sprawdzCaptcha(java.lang.String pCaptcha)*
     */
    public java.lang.Boolean sprawdzCaptcha(java.lang.String pCaptcha) {
        LOG.info("Executing operation sprawdzCaptcha");
        System.out.println(pCaptcha);
        try {
            java.lang.Boolean _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#getValue(java.lang.String pNazwaParametru)*
     */
    public java.lang.String getValue(java.lang.String pNazwaParametru) {
        LOG.info("Executing operation getValue");
        System.out.println(pNazwaParametru);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#zaloguj(java.lang.String pKluczUzytkownika)*
     */
    public java.lang.String zaloguj(java.lang.String pKluczUzytkownika) {
        LOG.info("Executing operation zaloguj");
        System.out.println(pKluczUzytkownika);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#wyloguj(java.lang.String pIdentyfikatorSesji)*
     */
    public java.lang.Boolean wyloguj(java.lang.String pIdentyfikatorSesji) {
        LOG.info("Executing operation wyloguj");
        System.out.println(pIdentyfikatorSesji);
        try {
            java.lang.Boolean _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#daneKomunikat()*
     */
    public java.lang.String daneKomunikat() {
        LOG.info("Executing operation daneKomunikat");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#pobierzCaptcha()*
     */
    public java.lang.String pobierzCaptcha() {
        LOG.info("Executing operation pobierzCaptcha");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cis.bir.publ._2014._07.IUslugaBIRzewnPubl#danePobierzPelnyRaport(java.lang.String pRegon, java.lang.String pNazwaRaportu)*
     */
    public java.lang.String danePobierzPelnyRaport(java.lang.String pRegon, java.lang.String pNazwaRaportu) {
        LOG.info("Executing operation danePobierzPelnyRaport");
        System.out.println(pRegon);
        System.out.println(pNazwaRaportu);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}