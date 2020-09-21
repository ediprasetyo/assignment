package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class T2_employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String birth_date;
    private Long position_id;
    private Long id_number;
    private Long gender;
    private int is_delete;

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

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public Long getPosition_id() {
		return position_id;
	}

	public void setPosition_id(Long position_id) {
		this.position_id = position_id;
	}

	public Long getId_number() {
		return id_number;
	}

	public void setId_number(Long id_number) {
		this.id_number = id_number;
	}

	public Long getGender() {
		return gender;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	@Override
    public String toString() {
        return "T2_employee{" + "id='" + id + '\'' + "name='" + name + '\'' + ", birth_date='" + birth_date + '\''
        		+ ", position_id='" + position_id + '\''+ ", id_number='" + id_number + '\''+ ", gender='" + gender + '\''
        		+ ", is_delete='" + is_delete + '\''+ '}';
    }
}