package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dept")
@Scope("prototype") // singleton // by default spring follows singleton design pattern
public class Department {

	@Value("34")
	int deptId;
	@Value("Marketing")
	String name;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String name) {
		super();
		this.deptId = deptId;
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + "]";
	}

}