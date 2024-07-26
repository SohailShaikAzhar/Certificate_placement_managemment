package com.certificates.Certificate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.certificates.Certificate.entity.Certificate;
import com.certificates.Certificate.service.Certificate_service;

@RestController
public class Certificate_controller
{
    @Autowired
    private Certificate_service cs;
    
    @PostMapping("/Certificate")
    public Certificate registercertificate(@RequestBody Certificate C)
    {
    	return cs.registercertificate(C);
    }
    
    @GetMapping("/Certificate")
    public List<Certificate> getcertificate()
    {
		return cs.getcertificate();
    }

    @DeleteMapping("/Certificate/{id}")
    public void deletecretificate(@PathVariable("id") Integer id)
    {
    	cs.deletecertificate(id);
    }
    
    @PutMapping("/Certificate/{id}")
	public Certificate particularcertificate(@PathVariable("id") Integer id,@RequestBody Certificate c) 
    {
		return cs.updateCertificate(id, c);
	}
    
}
