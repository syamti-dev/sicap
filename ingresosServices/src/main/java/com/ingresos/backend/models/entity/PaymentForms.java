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
 * PaymentForms generated by hbm2java
 */
@Entity
@Table(name = "payment_forms", catalog = "ingresosdb")
public class PaymentForms implements java.io.Serializable {

	private Integer id;
	private String basis;
	private Date cat;
	private int cbu;
	private String codeSat;
	private String concept;
	private String description;
	private boolean fdl;
	private int luu;
	private Date uat;

	public PaymentForms() {
	}

	public PaymentForms(String basis, Date cat, int cbu, String codeSat, String concept, String description,
			boolean fdl, int luu, Date uat) {
		this.basis = basis;
		this.cat = cat;
		this.cbu = cbu;
		this.codeSat = codeSat;
		this.concept = concept;
		this.description = description;
		this.fdl = fdl;
		this.luu = luu;
		this.uat = uat;
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

	@Column(name = "basis", nullable = false, length = 100)
	public String getBasis() {
		return this.basis;
	}

	public void setBasis(String basis) {
		this.basis = basis;
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

	@Column(name = "code_sat", nullable = false, length = 2)
	public String getCodeSat() {
		return this.codeSat;
	}

	public void setCodeSat(String codeSat) {
		this.codeSat = codeSat;
	}

	@Column(name = "concept", nullable = false, length = 200)
	public String getConcept() {
		return this.concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	@Column(name = "description", nullable = false, length = 150)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

}
