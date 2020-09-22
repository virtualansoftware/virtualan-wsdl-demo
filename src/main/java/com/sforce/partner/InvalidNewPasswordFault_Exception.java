
package com.sforce.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-09-21T07:44:16.971-05:00
 * Generated source version: 3.3.7
 */

@WebFault(name = "InvalidNewPasswordFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class InvalidNewPasswordFault_Exception extends Exception {

    private com.sforce.partner.InvalidNewPasswordFault invalidNewPasswordFault;

    public InvalidNewPasswordFault_Exception() {
        super();
    }

    public InvalidNewPasswordFault_Exception(String message) {
        super(message);
    }

    public InvalidNewPasswordFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InvalidNewPasswordFault_Exception(String message, com.sforce.partner.InvalidNewPasswordFault invalidNewPasswordFault) {
        super(message);
        this.invalidNewPasswordFault = invalidNewPasswordFault;
    }

    public InvalidNewPasswordFault_Exception(String message, com.sforce.partner.InvalidNewPasswordFault invalidNewPasswordFault, java.lang.Throwable cause) {
        super(message, cause);
        this.invalidNewPasswordFault = invalidNewPasswordFault;
    }

    public com.sforce.partner.InvalidNewPasswordFault getFaultInfo() {
        return this.invalidNewPasswordFault;
    }
}
