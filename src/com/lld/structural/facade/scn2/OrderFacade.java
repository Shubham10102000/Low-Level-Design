package com.lld.structural.facade.scn2;

import com.lld.structural.facade.scn2.system.Invoice;
import com.lld.structural.facade.scn2.system.Payment;
import com.lld.structural.facade.scn2.system.ProductDao;
import com.lld.structural.facade.scn2.system.SendNotification;

public class OrderFacade {
    private final ProductDao productDao;
    private final Invoice invoice;
    private final Payment payment;
    private final SendNotification sendNotification;

    public OrderFacade() {
        productDao = new ProductDao();
        invoice = new Invoice();
        payment = new Payment();
        sendNotification = new SendNotification();
    }

    public void createOrder() {
        productDao.getProduct(13123);
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.sendNotification();
    }
}
