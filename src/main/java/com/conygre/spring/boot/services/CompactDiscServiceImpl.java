package com.conygre.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conygre.spring.boot.repos.CompactDiscRepository;
import com.conygre.training.entities.CompactDisc;
@Service
public class CompactDiscServiceImpl implements CompactDiscService {

	@Autowired
	private CompactDiscRepository dao;

	/* (non-Javadoc)
	 * @see com.conygre.spring.boot.services.ICompactDiscService#getCatalog()
	 */
	public Iterable<CompactDisc> getCatalog() {
		return dao.findAll();
	}
}
