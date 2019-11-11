package com.esprit.models;

import javax.persistence.Entity;

@Entity
public class Infermier extends Personnel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String specialte;

    public String getSpecialte() {
        return specialte;
    }

    public void setSpecialte(String specialte) {
        this.specialte = specialte;
    }
}
