package org.acme;

import java.util.*;

public class ReportServices {

    ReportRepository repository = new ReportRepository();


    public List<Payment> getAllReportCustomer(String cid) {
        List<Payment> my_list = new ArrayList<>();
        for (Map.Entry<UUID, Payment> paymentEntry : repository.payments.entrySet()) {
            if (paymentEntry.getValue().getCustomerID().equals(cid))
                my_list.add(paymentEntry.getValue());
        }
        return my_list;
    }

    public List<Payment> getAllReportMarchant(String mid) {
        List<Payment> my_list = new ArrayList<>();
        for (Map.Entry<UUID, Payment> paymentEntry : repository.payments.entrySet()) {
            if (paymentEntry.getValue().getMerchantId().equals(mid) && paymentEntry.getValue().getMessageId().equals("transfer"))
                my_list.add(paymentEntry.getValue());
        }
        return my_list;
    }

    public List<Payment> getAllReportDTUPay() {
        List<Payment> my_list = new ArrayList<>();
        for (Map.Entry<UUID, Payment> paymentEntry : repository.payments.entrySet()) {
            my_list.add(paymentEntry.getValue());
        }
        return my_list;
    }
}
