package com.conygre.spring.boot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.conygre.spring.boot.services.CompactDiscService;
import com.conygre.training.entities.CompactDisc;


@RestController
@RequestMapping("/api/compactdiscs")
public class CompactDiscController {

	@Autowired
	private  CompactDiscService service;

	@RequestMapping(method = RequestMethod.GET)
	Iterable<CompactDisc> findAll() {
		return service.getCatalog();
	}
}
