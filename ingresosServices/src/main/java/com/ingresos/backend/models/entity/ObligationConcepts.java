package com.ingresos.backend.models.entity;
// Generated 7/12/2018 11:37:07 PM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ObligationConcepts generated by hbm2java
 */
@Entity
@Table(name = "obligation_concepts", catalog = "ingresosdb")
public class ObligationConcepts implements java.io.Serializable {

	private Integer id;
	private Date cat;
	private int cbu;
	private boolean fdl;
	private int luu;
	private Date uat;
	private int idConcept;
	private int idObligation;

	public ObligationConcepts() {
	}

	public ObligationConcepts(Date cat, int cbu, boolean fdl, int luu, Date uat, int idConcept, int idObligation) {
		this.cat = cat;
		this.cbu = cbu;
		this.fdl = fdl;
		this.luu = luu;
		this.uat = uat;
		this.idConcept = idConcept;
		this.idObligation = idObligation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cat", nullable = false, length = 19)
	public Date getCat() {
		return this.cat;
	}

	public void setCat(Date cat) {
		this.cat = cat;
	}

	@Column(name = "cbu", nullable = false)
	public int getCbu() {
		return this.cbu;
	}

	public void setCbu(int cbu) {
		this.cbu = cbu;
	}

	@Column(name = "fdl", nullable = false)
	public boolean isFdl() {
		return this.fdl;
	}

	public void setFdl(boolean fdl) {
		this.fdl = fdl;
	}

	@Column(name = "luu", nullable = false)
	public int getLuu() {
		return this.luu;
	}

	public void setLuu(int luu) {
		this.luu = luu;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "uat", nullable = false, length = 19)
	public Date getUat() {
		return this.uat;
	}

	public void setUat(Date uat) {
		this.uat = uat;
	}

	@Column(name = "id_concept", nullable = false)
	public int getIdConcept() {
		return this.idConcept;
	}

	public void setIdConcept(int idConcept) {
		this.idConcept = idConcept;
	}

	@Column(name = "id_obligation", nullable = false)
	public int getIdObligation() {
		return this.idObligation;
	}

	public void setIdObligation(int idObligation) {
		this.idObligation = idObligation;
	}

}
