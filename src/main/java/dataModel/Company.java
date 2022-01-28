package dataModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Company {
     
	@Id
	@GeneratedValue
	Long id;
	
	String name;
	
	String email;
	


	String location;
	
	String companyType;
	
	String password;
	
	
	
	

	public Company() {
		super();
	}
	

	public Company(Long id, String name, String location, String companyType, String password,
			String email) {
		
		this.id = id;
		this.name = name;
		this.location = location;
		this.companyType = companyType;
		this.password = password;
		this.email = email;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", location=" + location + ", companyType=" + companyType
				+ ", password=" + password + ", email=" + email + "]";
	}
	
	
}
