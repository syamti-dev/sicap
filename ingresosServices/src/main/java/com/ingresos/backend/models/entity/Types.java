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
 * Types generated by hbm2java
 */
@Entity
@Table(name = "types", catalog = "ingresosdb")
public class Types implements java.io.Serializable {

	private Integer id;
	private Date cat;
	private int cbu;
	private String code;
	private String description;
	private boolean fdl;
	private int luu;
	private Date uat;
	private int idItem;
	private Set<Classes> classeses = new HashSet<Classes>(0);

	public Types() {
	}

	public Types(Date cat, int cbu, String code, String description, boolean fdl, int luu, Date uat, int idItem) {
		this.cat = cat;
		this.cbu = cbu;
		this.code = code;
		this.description = description;
		this.fdl = fdl;
		this.luu = luu;
		this.uat = uat;
		this.idItem = idItem;
	}

	public Types(Date cat, int cbu, String code, String description, boolean fdl, int luu, Date uat, int idItem,
			Set<Classes> classeses) {
		this.cat = cat;
		this.cbu = cbu;
		this.code = code;
		this.description = description;
		this.fdl = fdl;
		this.luu = luu;
		this.uat = uat;
		this.idItem = idItem;
		this.classeses = classeses;
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

	@Column(name = "code", nullable = false, length = 5)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	@Column(name = "id_item", nullable = false)
	public int getIdItem() {
		return this.idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "types")
	public Set<Classes> getClasseses() {
		return this.classeses;
	}

	public void setClasseses(Set<Classes> classeses) {
		this.classeses = classeses;
	}

}
