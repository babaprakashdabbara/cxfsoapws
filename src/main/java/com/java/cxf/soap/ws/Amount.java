package com.java.cxf.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebFault;

/**
 * Created by Babaprakash Dabbara on 02-06-2017.
 */
@WebService
@SOAPBinding
public interface Amount {

    @WebMethod
    @WebResult(name = "totalAmount")
    Integer addAmount(@WebParam Integer amountToAdd);

    @WebMethod
    @WebResult(name = "totalAmount")
    Integer substractAmount(@WebParam(name = "amountToSubstract") Integer amountToSubstract);
}