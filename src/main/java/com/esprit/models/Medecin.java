package com.esprit.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Medecin extends Personnel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String specialite;
    @OneToMany(mappedBy = "medecin")
	private Consultation consultation;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
    
}
