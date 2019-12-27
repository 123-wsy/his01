package org.neuedu.his.controller;

import org.neuedu.his.model.Invoice;
import org.neuedu.his.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Invoice")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;
    @GetMapping("/getInvoice")
    public Invoice getInvoice(){
        return invoiceService.getInvoice();
    }
}
