package com.cg.shoppingmallmanagementsystem;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MallAdmin {
	
	private Integer id;
	private String name;
	private String password;
	private String mall;
	private String phone;
	
	public MallAdmin(Integer id, String name, String password, String mall, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
	}

	public MallAdmin() {
		super();
	}

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getMall() {
		return mall;
	}

	public void setMall(String mall) {
		this.mall = mall;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MallAdminEntity [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
				+ phone + "]";
	}
	
	
	
}