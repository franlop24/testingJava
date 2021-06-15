package com.franlops.TestingJUnit.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor;

    @Before
    public void setup(){
         paymentGateway = Mockito.mock(PaymentGateway.class);
         paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_id_correct(){
        //Preparacion
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        //Ejecucion
        boolean result = paymentProcessor.makePayment(1000);

        //Prueba
        assertTrue(result);
    }

    @Test
    public void payment_id_wrong(){
        //Preparacion
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        //Ejecucion
        boolean result = paymentProcessor.makePayment(1000);

        //Prueba
        assertFalse(result);
    }
}