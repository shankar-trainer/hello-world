package com.audintel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.audintel.model.ManufacturingCompany;

public interface ManufacturingCompanyRepository extends JpaRepository<ManufacturingCompany, Long>
{

}
