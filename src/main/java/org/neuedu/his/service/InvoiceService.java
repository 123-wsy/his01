package org.neuedu.his.service;

import org.neuedu.his.mapper.InvoiceMapper;
import org.neuedu.his.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    @Autowired
    InvoiceMapper invoiceMapper;
    public Invoice getInvoice() {
        return invoiceMapper.getInvoice();
    }
}
