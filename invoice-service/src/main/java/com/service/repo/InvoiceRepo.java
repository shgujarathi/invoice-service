package com.service.repo;

import java.util.List;

import com.service.business.Invoice;

public interface InvoiceRepo {

	public void saveInvoice(Invoice invoice);

	public List<Invoice> getAll();

}
