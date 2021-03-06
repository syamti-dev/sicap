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
 * MatrixCatalogAffectation generated by hbm2java
 */
@Entity
@Table(name = "matrix_catalog_affectation", catalog = "ingresosdb")
public class MatrixCatalogAffectation implements java.io.Serializable {

	private Integer id;
	private String accountName;
	private String accountingAccount;
	private Date cat;
	private int cbu;
	private boolean fdl;
	private int luu;
	private String movement;
	private String nature;
	private String typeAccount;
	private Date uat;

	public MatrixCatalogAffectation() {
	}

	public MatrixCatalogAffectation(String accountName, String accountingAccount, Date cat, int cbu, boolean fdl,
			int luu, String movement, String nature, String typeAccount, Date uat) {
		this.accountName = accountName;
		this.accountingAccount = accountingAccount;
		this.cat = cat;
		this.cbu = cbu;
		this.fdl = fdl;
		this.luu = luu;
		this.movement = movement;
		this.nature = nature;
		this.typeAccount = typeAccount;
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

	@Column(name = "account_name", nullable = false, length = 200)
	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Column(name = "accounting_account", nullable = false, length = 5)
	public String getAccountingAccount() {
		return this.accountingAccount;
	}

	public void setAccountingAccount(String accountingAccount) {
		this.accountingAccount = accountingAccount;
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

	@Column(name = "movement", nullable = false, length = 40)
	public String getMovement() {
		return this.movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}

	@Column(name = "nature", nullable = false, length = 40)
	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	@Column(name = "type_account", nullable = false, length = 40)
	public String getTypeAccount() {
		return this.typeAccount;
	}

	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
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
