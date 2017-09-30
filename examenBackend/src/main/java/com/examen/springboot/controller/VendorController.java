package com.examen.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.springboot.model.Vendor;
import com.examen.springboot.service.VendorService;

@RestController
@RequestMapping(value="/api")
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	
	@GetMapping(value="/vendor")
	public List<Vendor> getAll(){
		List<Vendor> vendors = (List<Vendor>)vendorService.findAll();
		return vendors;
	}
	
	@GetMapping(value="/vendor/{id}")
	public Vendor getVendor(@PathVariable Integer id){
		return  vendorService.getVendor(id);
	}
	
	@PostMapping(value="/vendor")
	public Vendor saveVendor(@RequestBody Vendor vendor){
	
		vendorService.saveOrUpdate(vendor);
		return vendor;
	}
	
	@PutMapping(value="/vendor")
	public void updateVendor(@RequestBody Vendor vendor){
		vendorService.saveOrUpdate(vendor);
	}
	
	
	@DeleteMapping(value="/vendor/{id}")
	public void deleteVendor(@PathVariable Integer id){
		vendorService.remove(id);
	}
}
