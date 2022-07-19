package com.devsuperior.dsmeta.controllers;

import java.util.List;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;

	@GetMapping
	public List<Sale> findSales() {
		return saleService.findSale();
	}
}
