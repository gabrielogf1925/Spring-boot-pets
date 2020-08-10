package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PETS_TBL")
public class Pets {

    @Id
    @GeneratedValue
    private int id;
    private String pet;
    private String  namePets;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public String getNamePets() {
		return namePets;
	}
	public void setNamePets(String namePets) {
		this.namePets = namePets;
	}
    
}