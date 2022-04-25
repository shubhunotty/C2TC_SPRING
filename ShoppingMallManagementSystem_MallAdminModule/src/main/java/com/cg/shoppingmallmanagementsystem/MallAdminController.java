package com.cg.shoppingmallmanagementsystem;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MallAdminController {
	
	@Autowired
	private MallAdminService service;
	
	// RESTful API methods for Retrieval operations
	@GetMapping("/malladmins")
	public List<MallAdmin> list()
	{
	return service.listAll();
	}
	
	// RESTful API methods for Retrieval By ID operations
	@GetMapping("/malladmins/{id}")
	public ResponseEntity<MallAdmin> get(@PathVariable Integer id)
	{
	try
	{
	MallAdmin malladmin = service.get(id);
	return new ResponseEntity<MallAdmin>(malladmin, HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<MallAdmin>(HttpStatus.NOT_FOUND);
	}
	}
	
	// RESTful API method for Create operation
	@PostMapping("/malladmins")
	public void add(@RequestBody MallAdmin malladmin)
	{
	service.save(malladmin);
	}
	
	// RESTful API method for Update operation
	@PutMapping("/malladmins/{id}")
	public ResponseEntity<?> update(@RequestBody MallAdmin malladmin, @PathVariable Integer id)
	{
	try
	{
	MallAdmin existMallAdmin = service.get(id);
	service.save(malladmin);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	
	// RESTful API method for Delete operation
	@DeleteMapping("/malladmins/{id}")
	public void delete(@PathVariable Integer id)
	{
	service.delete(id);
	}
}

