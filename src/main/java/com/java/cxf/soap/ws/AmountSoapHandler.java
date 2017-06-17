package com.java.cxf.soap.ws;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class AmountSoapHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("Inside Handle Message of AmountSoapHandler");
		Boolean isResponse = (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(!isResponse) {
			SOAPMessage soapMessage = context.getMessage();
			try {
				Iterator<?> allAttributes = soapMessage.getSOAPBody().getAllAttributes();
				while (allAttributes.hasNext()) {
					Node node = (Node)allAttributes.next();
					System.out.println(node.getLocalName());
				}
			} catch (SOAPException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Response On the Way");
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("Inside Fault");
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		return new TreeSet<>();
}
}
