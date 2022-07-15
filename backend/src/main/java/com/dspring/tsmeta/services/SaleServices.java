package com.dspring.tsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dspring.tsmeta.entities.Sale;
import com.dspring.tsmeta.repositories.SaleRepository;

@Service
public class SaleServices {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {	
		return repository.findAll();
	}
}
