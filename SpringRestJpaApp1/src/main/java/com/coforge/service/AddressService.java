package com.coforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coforge.dao.AddressDao;
import com.coforge.exception.AddressException;
import com.coforge.model.Address;

@Service
public class AddressService {

	@Autowired
	AddressDao dao;

	public Address addAddress(Address c) {
		Optional<Address> findById = dao.findById(c.getAddress_id());
		if (findById.isPresent())
			throw new AddressException("Address already present");
		else
			return dao.save(c);
	}

	public Address updateAddress(Address c) {
		Optional<Address> findById = dao.findById(c.getAddress_id());
		if (!findById.isPresent())
			throw new AddressException("Address not present");
		else
			return dao.save(c);
	}

	public Address removeAddress(long id) {
		Optional<Address> findById = dao.findById(id);
		if (findById.isPresent()) {
			Address Address = findById.get();
			dao.delete(Address);
			return Address;
		} else
			throw new AddressException("Address not present");

	}

	public Address searchAddress(long id) {
		Optional<Address> findById = dao.findById(id);
		if (findById.isPresent())
			return findById.get();
		else
			throw new AddressException("Address not present");
	}

	public List<Address> getAllAddress() {
		if (dao.findAll().size() == 0)
			throw new AddressException("Address list is empty");
		else
			return dao.findAll();
	}

}
