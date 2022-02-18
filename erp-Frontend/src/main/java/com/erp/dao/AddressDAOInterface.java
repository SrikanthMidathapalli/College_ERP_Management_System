package com.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.Address;
@Repository
public interface AddressDAOInterface extends JpaRepository<Address, Long>{

}
