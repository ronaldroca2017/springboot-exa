package com.examen.springboot.service;

import java.util.List;

import com.examen.springboot.model.Vendor;

public interface VendorService {
	
	public List<Vendor> findAll();
	
	public Vendor getVendor(Integer idVendor);
	
	public Vendor saveOrUpdate(Vendor vendor);
	
	public void remove(Integer idVendor);

}
