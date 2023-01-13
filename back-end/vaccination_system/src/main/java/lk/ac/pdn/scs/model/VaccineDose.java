package lk.ac.pdn.scs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccinedose")

public class VaccineDose {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="v_id")
	private int v_id;
	
	@Column(name="v_name")
	private String v_name;
	
	@Column(name="v_status")
	private String v_status;
	
	@Column(name="v_dose")
	private int v_dose;
	

	
	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public String getV_name() {
		return v_name;
	}

	public void setV_name(String v_name) {
		this.v_name = v_name;
	}

	public String getV_status() {
		return v_status;
	}

	public void setV_status(String v_status) {
		this.v_status = v_status;
	}

	public int getV_dose() {
		return v_dose;
	}

	public void setV_dose(int v_dose) {
		this.v_dose = v_dose;
	}


}