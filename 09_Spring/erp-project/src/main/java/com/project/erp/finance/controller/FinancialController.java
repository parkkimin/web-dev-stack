package com.project.erp.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/finance")
@Controller
public class FinancialController {

	@Autowired
	private SasleService saleService;
	
	
	@PostMapping("/insert")
	public String insert(Sale sale) {
		saleService.addSale(sale);
		return "redirect:/"
	}
	@GetMapping("/list")
	public String list() {
		List<Sale> list = slaeService.viewSale();
		
	}
}
