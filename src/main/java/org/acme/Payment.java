
package org.acme;

import java.math.BigDecimal;
/**
 * 
 * @author Yingli
 * @version 1.0
 * 
 */
public class Payment {
    private String paymentId;
    private String merchantId;
    private String customerId=null;
    private String messageId;
    private String token;
    private BigDecimal amount;

    
    public Payment(String paymentId, String merchantId, String token, BigDecimal amount) {
        this.merchantId = merchantId;
        this.paymentId = paymentId;
        this.token = token;
        this.amount = amount;
    }
    /*public Payment(String paymentId,String customerId, String merchantId, String token, BigDecimal amount) {
        this.merchantId = merchantId;
        this.customerId = customerId;
        this.paymentId = paymentId;
        this.token = token;
        this.amount = amount;
    }*/
    /*public Payment(String paymentId, String messageId, String merchantId, String token, BigDecimal amount) {
        this.merchantId = merchantId;
        this.paymentId = paymentId;
        this.token = token;
        this.amount = amount;
        this.messageId = messageId;
    }*/

    public Payment(String paymentId, String customerId, String merchantId, String token, BigDecimal amount) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.merchantId = merchantId;
        this.token = token;
        this.amount = amount;
    }
    public Payment(String paymentId, String customerId, String merchantId, String token, BigDecimal amount,String messageId) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.merchantId = merchantId;
        this.token = token;
        this.amount = amount;
        this.messageId = messageId;
    }

    public String getMerchantId() {
        return merchantId;
    }
    public void setMerchantId(String merchantID) {
        merchantId = merchantID;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentID() {
        return paymentId;
    }

    public void setPaymentID(String paymentID) {
        this.paymentId = paymentID;
    }

    public String getCustomerID() {
        return customerId;
    }

    public void setCustomerID(String customerID) {
        this.customerId = customerID;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
