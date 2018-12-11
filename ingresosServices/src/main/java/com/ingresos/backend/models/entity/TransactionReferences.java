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
 * TransactionReferences generated by hbm2java
 */
@Entity
@Table(name = "transaction_references", catalog = "ingresosdb")
public class TransactionReferences implements java.io.Serializable {

	private Integer id;
	private Date cat;
	private int cbu;
	private String dueDate;
	private boolean fdl;
	private int luu;
	private String reference;
	private Date uat;
	private Integer idBank;
	private int idTransactionH;
	private int idUser;

	public TransactionReferences() {
	}

	public TransactionReferences(Date cat, int cbu, String dueDate, boolean fdl, int luu, String reference, Date uat,
			int idTransactionH, int idUser) {
		this.cat = cat;
		this.cbu = cbu;
		this.dueDate = dueDate;
		this.fdl = fdl;
		this.luu = luu;
		this.reference = reference;
		this.uat = uat;
		this.idTransactionH = idTransactionH;
		this.idUser = idUser;
	}

	public TransactionReferences(Date cat, int cbu, String dueDate, boolean fdl, int luu, String reference, Date uat,
			Integer idBank, int idTransactionH, int idUser) {
		this.cat = cat;
		this.cbu = cbu;
		this.dueDate = dueDate;
		this.fdl = fdl;
		this.luu = luu;
		this.reference = reference;
		this.uat = uat;
		this.idBank = idBank;
		this.idTransactionH = idTransactionH;
		this.idUser = idUser;
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

	@Column(name = "due_date", nullable = false, length = 40)
	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
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

	@Column(name = "reference", nullable = false, length = 50)
	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "uat", nullable = false, length = 19)
	public Date getUat() {
		return this.uat;
	}

	public void setUat(Date uat) {
		this.uat = uat;
	}

	@Column(name = "id_bank")
	public Integer getIdBank() {
		return this.idBank;
	}

	public void setIdBank(Integer idBank) {
		this.idBank = idBank;
	}

	@Column(name = "id_transaction_h", nullable = false)
	public int getIdTransactionH() {
		return this.idTransactionH;
	}

	public void setIdTransactionH(int idTransactionH) {
		this.idTransactionH = idTransactionH;
	}

	@Column(name = "id_user", nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
