package dataModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Seeker {
	   
		@Id
		@GeneratedValue
		Long id;
		
		String name;
		
		String password;
		
		String email;
		
		public Seeker() {
			super();
		
		}
		public Seeker(Long id, String name, String password, String email) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.email= email;
		
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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Seeker [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
		}

	
		
		
		
}
