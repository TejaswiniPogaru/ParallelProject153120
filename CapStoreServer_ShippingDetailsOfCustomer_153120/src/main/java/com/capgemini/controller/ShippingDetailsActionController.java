package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.exception.InvalidCustomerIdException;
import com.capgemini.model.Customer;
import com.capgemini.service.ShippingDetails;

@RestController
public class ShippingDetailsActionController {
	@Autowired
	private ShippingDetails shippingDetailsservice;

	@RequestMapping(value = "/cart")
	public Customer getShippingDetails(int id) throws InvalidCustomerIdException {
		return shippingDetailsservice.gettingShippingDeatilsOfCustomer(id);
	}

}
