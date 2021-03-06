package com.ingresos.backend.models.entity;
// Generated 7/12/2018 11:37:07 PM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DetailPolicies generated by hbm2java
 */
@Entity
@Table(name = "detail_policies", catalog = "ingresosdb")
public class DetailPolicies implements java.io.Serializable {

	private Integer id;
	private Policies policies;
	private String accountingAccount;
	private double amount;
	private Date cat;
	private int cbu;
	private Date datePolicy;
	private String description;
	private boolean fdl;
	private String idExternal;
	private int luu;
	private char movement;
	private Date uat;

	public DetailPolicies() {
	}

	public DetailPolicies(Policies policies, String accountingAccount, double amount, Date cat, int cbu,
			Date datePolicy, String description, boolean fdl, String idExternal, int luu, char movement, Date uat) {
		this.policies = policies;
		this.accountingAccount = accountingAccount;
		this.amount = amount;
		this.cat = cat;
		this.cbu = cbu;
		this.datePolicy = datePolicy;
		this.description = description;
		this.fdl = fdl;
		this.idExternal = idExternal;
		this.luu = luu;
		this.movement = movement;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_policy", nullable = false)
	public Policies getPolicies() {
		return this.policies;
	}

	public void setPolicies(Policies policies) {
		this.policies = policies;
	}

	@Column(name = "accounting_account", nullable = false, length = 21)
	public String getAccountingAccount() {
		return this.accountingAccount;
	}

	public void setAccountingAccount(String accountingAccount) {
		this.accountingAccount = accountingAccount;
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

	@Column(name = "id_external", nullable = false, length = 10)
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

	@Column(name = "movement", nullable = false, length = 1)
	public char getMovement() {
		return this.movement;
	}

	public void setMovement(char movement) {
		this.movement = movement;
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
