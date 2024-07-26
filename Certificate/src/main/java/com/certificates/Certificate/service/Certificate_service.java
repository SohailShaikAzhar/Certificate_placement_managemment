package com.certificates.Certificate.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.certificates.Certificate.entity.Certificate;
import com.certificates.Certificate.repo.Certificate_repo;

@Service
public class Certificate_service 
{
    @Autowired
    public Certificate_repo cr;
    
    //create
	public Certificate registercertificate(Certificate c) 
	{
		return cr.save(c);
	}
    
	//read
	public List<Certificate> getcertificate()
	{
	    return(List<Certificate>) cr.findAll();	
	}
    
    // Update
    public Certificate updateCertificate(Integer id, Certificate c)
    {
        return cr.save(c);
    }
    
	//delete
	public void deletecertificate(Integer id)
	{
		cr.deleteById(id);
	}
	
}
