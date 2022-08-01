package com.addressbook.cloudsync.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addressbook.cloudsync.pojo.ContactsPojo;
import com.addressbook.cloudsync.service.ContactService;




@CrossOrigin //enables cross server connection
@RestController
@RequestMapping("api")
public class ContactsController {
	
	@Autowired
	ContactService contactsService;
	
	
	@PostMapping("addcontacts")
	public ContactsPojo addcontact(@RequestBody ContactsPojo contactsPojo) {
		return contactsService.addContact(contactsPojo);
	}
	
	@PutMapping("updatecontacts")
	public ContactsPojo updatecontact(@RequestBody ContactsPojo contactsPojo) {
		return contactsService.updateContact(contactsPojo);
	}
	
	@GetMapping("getallcontacts")
	public List<ContactsPojo> getAllContacts() {
		List<ContactsPojo> allContacts = contactsService.getAllContacts();
		return contactsService.getAllContacts();
	}


}
