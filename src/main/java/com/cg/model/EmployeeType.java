package com.cg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employeeTypes")
public class EmployeeType {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable=false)
	private String typeName;

	@OneToMany(targetEntity = Employee.class, fetch = FetchType.EAGER)
	private Set<Employee> employees;

	@OneToMany(targetEntity = Department.class, fetch = FetchType.EAGER)
	private Set<Department> departments;

	public EmployeeType (String typeName) {
		this.typeName = typeName;
	}

}