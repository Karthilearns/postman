package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dataModel.Company;

public interface CompanyRepository extends JpaRepository<Company,Long>{

}
