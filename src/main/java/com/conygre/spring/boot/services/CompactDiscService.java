package com.conygre.spring.boot.services;

import com.conygre.training.entities.CompactDisc;

public interface CompactDiscService {
	Iterable<CompactDisc> getCatalog();
}