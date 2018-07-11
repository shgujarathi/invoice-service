package com.service.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.service.business.Invoice;

@Repository
public class InvoiceRepoImpl implements InvoiceRepo {

	Map<String, Invoice> invoiceList = new HashMap<>();

	@Override
	public void saveInvoice(Invoice invoice) {
		invoiceList.put(invoice.getId().toString(), invoice);
	}

	@Override
	public List<Invoice> getAll() {
		return invoiceList.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
	}

}
