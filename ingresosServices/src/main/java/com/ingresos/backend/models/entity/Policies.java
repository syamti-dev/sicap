package com.ingresos.backend.models.entity;
// Generated 7/12/2018 11:37:07 PM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Policies generated by hbm2java
 */
@Entity
@Table(name = "policies", catalog = "ingresosdb")
public class Policies implements java.io.Serializable {

	private Integer id;
	private double amount;
	private Date cat;
	private int cbu;
	private Date datePolicy;
	private String description;
	private boolean fdl;
	private String idExternal;
	private int luu;
	private Character statusPoliza;
	private Date uat;
	private int idEntityOffice;
	private int idTypePolicy;
	private int idUser;
	private Set<DetailPolicies> detailPolicieses = new HashSet<DetailPolicies>(0);

	public Policies() {
	}

	public Policies(double amount, Date cat, int cbu, Date datePolicy, String description, boolean fdl, int luu,
			Date uat, int idEntityOffice, int idTypePolicy, int idUser) {
		this.amount = amount;
		this.cat = cat;
		this.cbu = cbu;
		this.datePolicy = datePolicy;
		this.description = description;
		this.fdl = fdl;
		this.luu = luu;
		this.uat = uat;
		this.idEntityOffice = idEntityOffice;
		this.idTypePolicy = idTypePolicy;
		this.idUser = idUser;
	}

	public Policies(double amount, Date cat, int cbu, Date datePolicy, String description, boolean fdl,
			String idExternal, int luu, Character statusPoliza, Date uat, int idEntityOffice, int idTypePolicy,
			int idUser, Set<DetailPolicies> detailPolicieses) {
		this.amount = amount;
		this.cat = cat;
		this.cbu = cbu;
		this.datePolicy = datePolicy;
		this.description = description;
		this.fdl = fdl;
		this.idExternal = idExternal;
		this.luu = luu;
		this.statusPoliza = statusPoliza;
		this.uat = uat;
		this.idEntityOffice = idEntityOffice;
		this.idTypePolicy = idTypePolicy;
		this.idUser = idUser;
		this.detailPolicieses = detailPolicieses;
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

	@Column(name = "amount", nullable = false, precision = 22, scale = 0)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_policy", nullable = false, length = 19)
	public Date getDatePolicy() {
		return this.datePolicy;
	}

	public void setDatePolicy(Date datePolicy) {
		this.datePolicy = datePolicy;
	}

	@Column(name = "description", nullable = false, length = 200)
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

	@Column(name = "id_external", length = 10)
	public String getIdExternal() {
		return this.idExternal;
	}

	public void setIdExternal(String idExternal) {
		this.idExternal = idExternal;
	}

	@Column(name = "luu", nullable = false)
	public int getLuu() {
		return this.luu;
	}

	public void setLuu(int luu) {
		this.luu = luu;
	}

	@Column(name = "status_poliza", length = 1)
	public Character getStatusPoliza() {
		return this.statusPoliza;
	}

	public void setStatusPoliza(Character statusPoliza) {
		this.statusPoliza = statusPoliza;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "uat", nullable = false, length = 19)
	public Date getUat() {
		return this.uat;
	}

	public void setUat(Date uat) {
		this.uat = uat;
	}

	@Column(name = "id_entity_office", nullable = false)
	public int getIdEntityOffice() {
		return this.idEntityOffice;
	}

	public void setIdEntityOffice(int idEntityOffice) {
		this.idEntityOffice = idEntityOffice;
	}

	@Column(name = "id_type_policy", nullable = false)
	public int getIdTypePolicy() {
		return this.idTypePolicy;
	}

	public void setIdTypePolicy(int idTypePolicy) {
		this.idTypePolicy = idTypePolicy;
	}

	@Column(name = "id_user", nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "policies")
	public Set<DetailPolicies> getDetailPolicieses() {
		return this.detailPolicieses;
	}

	public void setDetailPolicieses(Set<DetailPolicies> detailPolicieses) {
		this.detailPolicieses = detailPolicieses;
	}

}