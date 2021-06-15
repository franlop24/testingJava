package com.franlops.TestingJUnit.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
