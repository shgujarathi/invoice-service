package com.service.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.service.business.Invoice;
import com.service.business.Milestone;
import com.service.repo.InvoiceRepo;

@RestController
public class InvoiceController {

	Logger logger = Logger.getLogger(InvoiceController.class.getName());

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	InvoiceRepo invoiceRepo;

	@HystrixCommand(fallbackMethod = "defaultInvoice")
	@PostMapping(value = "/addInvoice")
	public void saveInvoice(@RequestBody Invoice invoice) {

		logger.log(Level.INFO, "Adding Invoice");

		Milestone milestone = restTemplate.getForObject("http://milestone-service/milestone/getMilestone/2",
				Milestone.class);
		invoice.setMilestone(milestone);
		invoiceRepo.saveInvoice(invoice);

	}

	public void defaultInvoice(Invoice invoice) {
		invoice.setMilestone(new Milestone(9999L, "01/01/2000", "01/01/9999", 10L, 100L));
		invoiceRepo.saveInvoice(invoice);
	}

	@GetMapping("/getAll")
	public List<Invoice> getAll() {
		return invoiceRepo.getAll();
	}

}
