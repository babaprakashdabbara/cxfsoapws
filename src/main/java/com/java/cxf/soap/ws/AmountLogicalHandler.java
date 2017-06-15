package com.java.cxf.soap.ws;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

public class AmountLogicalHandler implements LogicalHandler<LogicalMessageContext> {

	@Override
	public boolean handleMessage(LogicalMessageContext context) {
		System.out.println("Inside Handle Message of AmountLogicalHandler");
		return true;
	}

	@Override
	public boolean handleFault(LogicalMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("Inside Close Method of AmountHandler");
	}
}
