package io.firstapp.springbootstarter.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Basic;
//import com.sun.istack.Nullable;

@Entity
@Table(name="Employee")
public class Employee {
	
//	@Id //>>For marking column a id column in the table ie unique value
//	@GeneratedValue(strategy = GenerationType.IDENTITY)  //>>FOr auto generated columns
//  @Nullable //>>For marking a column that the column may have null value
//  @Basic(optional=true)  //>>optional columns like updated_date and created_date 
	@Id
	@Column(name="EmployeeID")
	private Integer employeeId;
	@Column(name="LastName")
    private String lastName;
	@Column(name="FirstName")
    private String firstName;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="Address")
    private String address;
    @Column(name="City")
    private String city;

}
