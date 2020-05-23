package com.rediff.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600,origins = "*")
public class PaymentController 
{
	@GetMapping("/getpayment")
	@PreAuthorize("hasRole('VIEW')")
	public String getpaymentInfo()
	{
		return "Payment Found";
	}

	@GetMapping({"/dopayment","/"})
	@PreAuthorize("hasRole('PAYMENT')")
	public String doPayment()
	{
		return "Payment Done $$$";
	}
	
	@GetMapping("/revpayment")
	@PreAuthorize("hasRole('MANAGE')")
	public String reversePayment()
	{
		return "Reverse Payment Done..";
	}
}
