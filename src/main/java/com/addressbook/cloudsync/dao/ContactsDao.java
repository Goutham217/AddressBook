package com.addressbook.cloudsync.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addressbook.cloudsync.entity.ContactsEntity;

public interface ContactsDao extends JpaRepository<ContactsEntity, Integer> {

}
