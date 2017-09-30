package com.examen.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.springboot.model.Vendor;
import com.examen.springboot.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public List<Vendor> findAll() {
		return (List<Vendor>) vendorRepository.findAll();
	}

	@Override
	public Vendor getVendor(Integer idVendor) {
		return vendorRepository.findOne(idVendor);
	}

	@Override
	public Vendor saveOrUpdate(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public void remove(Integer idVendor) {
		vendorRepository.delete(idVendor);

	}

}
