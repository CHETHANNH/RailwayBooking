package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(generator= "x")
	@SequenceGenerator(name="x",sequenceName="x",initialValue=1214562,allocationSize = 1)
	int id;
	String firstname;
	String lastname;
	long mobile;
	String email;
	String gender;
	String password1;
	//String password2;
	Date dob;
	int age;
	double wallet;
	
	
}
