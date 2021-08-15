package com.econetwireless.epay.business.utils;

import com.econetwireless.in.soap.messages.BalanceResponse;
import com.econetwireless.in.soap.messages.CreditRequest;
import com.econetwireless.in.soap.messages.CreditResponse;
import com.econetwireless.utils.pojo.INBalanceResponse;
import com.econetwireless.utils.pojo.INCreditRequest;
import com.econetwireless.utils.pojo.INCreditResponse;
import junit.framework.TestCase;
import org.junit.Test;

public class MessageConvertersTest extends TestCase {


    @Test
    public void testConvertNullInINCreditRequestToCreditRequestShouldReturnNull() {
        CreditRequest actual = MessageConverters.convert((INCreditRequest) null);
        assertNull(actual);
    }

    @Test
    public void testConvertNoneNullInINCreditRequestToCreditRequestShouldReturnNoneNull() {
        INCreditRequest expected = new INCreditRequest();
        CreditRequest actual = MessageConverters.convert(expected);

        assertNotNull(actual);

        assertEquals(expected.getAmount(), actual.getAmount(), 0.001);
        assertEquals(expected.getMsisdn(), actual.getMsisdn());
        assertEquals(expected.getPartnerCode(), actual.getPartnerCode());
        assertEquals(expected.getReferenceNumber(), actual.getReferenceNumber());
    }

    @Test
    public void testConvertNullCreditRequestToInINCreditRequestShouldReturnNull() {
        INCreditRequest result = MessageConverters.convert((CreditRequest) null);
        assertNull(result);
    }

    @Test
    public void testConvertNoneNullCreditRequestToInINCreditRequestShouldReturnNoneNull() {
        CreditRequest expected = new CreditRequest();
        INCreditRequest actual = MessageConverters.convert(expected);

        assertNotNull(actual);

        assertEquals(expected.getAmount(), actual.getAmount(), 0.001);
        assertEquals(expected.getMsisdn(), actual.getMsisdn());
        assertEquals(expected.getPartnerCode(), actual.getPartnerCode());
        assertEquals(expected.getReferenceNumber(), actual.getReferenceNumber());
    }

    @Test
    public void testConvertNullINCreditResponseToCreditResponseShouldReturnNull() {
        INCreditResponse actual = MessageConverters.convert((CreditResponse) null);
        assertNull(actual);
    }

    @Test
    public void testConvertNoneINCreditResponseToCreditResponseShouldReturnNoneNull() {

        CreditResponse expected = new CreditResponse();
        INCreditResponse actual = MessageConverters.convert(expected);
        assertNotNull(actual);

        assertEquals(expected.getBalance(), actual.getBalance(), 0.001);
        assertEquals(expected.getMsisdn(), actual.getMsisdn());
        assertEquals(expected.getNarrative(), actual.getNarrative());
        assertEquals(expected.getResponseCode(), actual.getResponseCode());

    }

    @Test
    public void testConvertNullCreditResponseToINCreditResponseShouldReturnNull() {
        CreditResponse actual = MessageConverters.convert((INCreditResponse) null);
        assertNull(actual);
    }

    @Test
    public void testConvertNoneCreditResponseToINCreditResponseShouldReturnNoneNull() {

        INCreditResponse expected = new INCreditResponse();
        CreditResponse actual = MessageConverters.convert(expected);
        assertNotNull(actual);

        assertEquals(expected.getBalance(), actual.getBalance(), 0.001);
        assertEquals(expected.getMsisdn(), actual.getMsisdn());
        assertEquals(expected.getNarrative(), actual.getNarrative());
        assertEquals(expected.getResponseCode(), actual.getResponseCode());

    }

    @Test
    public void tetsConvertNullINBalanceResponseToBalanceResponseShouldReturnNull() {
        BalanceResponse actual = MessageConverters.convert((INBalanceResponse) null);
        assertNull(actual);
    }

    @Test
    public void testConvertNoneBalanceResponseToBalanceResponseShouldReturnNoneNull() {

        INBalanceResponse expected = new INBalanceResponse();
        BalanceResponse actual = MessageConverters.convert(expected);
        assertNotNull(actual);

        assertEquals(expected.getAmount(), actual.getAmount(), 0.001);
        assertEquals(expected.getMsisdn(), actual.getMsisdn());
        assertEquals(expected.getNarrative(), actual.getNarrative());
        assertEquals(expected.getResponseCode(), actual.getResponseCode());

    }
    @Test
    public void testConvertNullBalanceResponseToINBalanceResponseShouldReturnNull() {
        INBalanceResponse actual = MessageConverters.convert((BalanceResponse) null);
        assertNull(actual);
    }

    @Test
    public void testConvertNoneNullBalanceResponseToINBalanceResponseShouldReturnNoneNull() {

        BalanceResponse expected = new BalanceResponse();
        INBalanceResponse actual = MessageConverters.convert(expected);
        assertNotNull(actual);

        assertEquals(expected.getAmount(), actual.getAmount(), 0.001);
        assertEquals(expected.getMsisdn(), actual.getMsisdn());
        assertEquals(expected.getNarrative(), actual.getNarrative());
        assertEquals(expected.getResponseCode(), actual.getResponseCode());

    }


}