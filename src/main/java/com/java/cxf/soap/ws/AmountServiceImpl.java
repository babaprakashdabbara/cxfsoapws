package com.java.cxf.soap.ws;

/**
 * Created by Babaprakash Dabbara on 03-06-2017.
 */
public class AmountServiceImpl implements Amount {

    private final static Integer amount = Integer.valueOf(0);

    @Override
    public Integer addAmount(Integer amountToAdd) {
        return amount + amountToAdd;
    }

    @Override
    public Integer substractAmount(Integer amountToSubstract) {
        return amount - amountToSubstract;
    }
}
