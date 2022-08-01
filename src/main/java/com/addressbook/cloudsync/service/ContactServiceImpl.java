package com.addressbook.cloudsync.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressbook.cloudsync.dao.ContactsDao;
import com.addressbook.cloudsync.entity.ContactsEntity;
import com.addressbook.cloudsync.pojo.ContactsPojo;



@Service
public class ContactServiceImpl implements ContactService {
	
	
	@Autowired
	ContactsDao contactsDao;

	@Override
	public ContactsPojo addContact(ContactsPojo contactsPojo) {
		
		ContactsEntity contactsEntity = new ContactsEntity();
		BeanUtils.copyProperties(contactsPojo, contactsEntity);
		
		ContactsEntity returnedContactsEntity = contactsDao.saveAndFlush(contactsEntity);
		contactsPojo.setUserId(returnedContactsEntity.getUserId());
		return contactsPojo;
	}

	@Override
	public ContactsPojo updateContact(ContactsPojo contactsPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactsPojo deleteContact(ContactsPojo contactsPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactsPojo> getAllContacts() {
		List<ContactsEntity> allContactsEntity = contactsDao.findAll();
		List<ContactsPojo> allContactsPojo = new ArrayList<ContactsPojo>();
		for(ContactsEntity fetchedContactsEntity: allContactsEntity) {
			ContactsPojo returnContactsPojo = new ContactsPojo(fetchedContactsEntity.getUserId(), fetchedContactsEntity.getFirstName(), fetchedContactsEntity.getLastName(), fetchedContactsEntity.getEmail(), fetchedContactsEntity.getImage(), fetchedContactsEntity.getPhoneNumber() );
			allContactsPojo.add(returnContactsPojo);
		}
		return allContactsPojo;
	}
}


