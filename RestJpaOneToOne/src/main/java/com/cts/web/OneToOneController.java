package com.cts.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cts.dao.StudentRepository;
import com.cts.model.Student;

import com.cts.dao.AddressRepository;
import com.cts.model.Address;

@RestController
@RequestMapping("/student")
public class OneToOneController {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	AddressRepository addressRepository;

	@GetMapping("/allStudent")
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@GetMapping("/allAddress1")
	public List<Address> getAllAddress() {
		// System.out.println("address size.. "+addressRepository.findAll().size());+
		addressRepository.findAll()
				.forEach(a -> System.out.println(a.getAddrId() + ", " + a.getAddrCity() + "," + a.getAddrState()));

		return addressRepository.findAll();
	}

	@GetMapping("searchStudent/{id}")
	public Student searchStudent(@PathVariable("id") int id) {

		Optional<Student> findById = studentRepository.findById(id);

		if (findById.isPresent())
			return findById.get();
		return null;
	}

	@PostMapping("addStudent")
	public Student addStudent(@RequestBody Student st) {

		Optional<Student> findById = studentRepository.findById(st.getRoll());

		if (!findById.isPresent()) {
			addressRepository.save(st.getAddress());
			return studentRepository.save(st);
		}
		return null;
	}

}
