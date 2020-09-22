
package com.sforce.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-09-21T07:44:16.947-05:00
 * Generated source version: 3.3.7
 */

@WebFault(name = "InvalidFieldFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class InvalidFieldFault_Exception extends Exception {

    private com.sforce.partner.InvalidFieldFault invalidFieldFault;

    public InvalidFieldFault_Exception() {
        super();
    }

    public InvalidFieldFault_Exception(String message) {
        super(message);
    }

    public InvalidFieldFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InvalidFieldFault_Exception(String message, com.sforce.partner.InvalidFieldFault invalidFieldFault) {
        super(message);
        this.invalidFieldFault = invalidFieldFault;
    }

    public InvalidFieldFault_Exception(String message, com.sforce.partner.InvalidFieldFault invalidFieldFault, java.lang.Throwable cause) {
        super(message, cause);
        this.invalidFieldFault = invalidFieldFault;
    }

    public com.sforce.partner.InvalidFieldFault getFaultInfo() {
        return this.invalidFieldFault;
    }
}
