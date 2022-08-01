package com.addressbook.cloudsync.service;

import java.util.List;

import com.addressbook.cloudsync.pojo.ContactsPojo;


public interface ContactService {
	
	ContactsPojo addContact(ContactsPojo contactsPojo);
	ContactsPojo updateContact(ContactsPojo contactsPojo);
	ContactsPojo deleteContact(ContactsPojo contactsPojo);
	List<ContactsPojo> getAllContacts();

}
