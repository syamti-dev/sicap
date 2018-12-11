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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classes generated by hbm2java
 */
@Entity
@Table(name = "classes", catalog = "ingresosdb")
public class Classes implements java.io.Serializable {

	private Integer id;
	private Types types;
	private Date cat;
	private int cbu;
	private String code;
	private String description;
	private boolean fdl;
	private int luu;
	private Date uat;
	private Set<CatalogConcepts> catalogConceptses = new HashSet<CatalogConcepts>(0);

	public Classes() {
	}

	public Classes(Types types, Date cat, int cbu, String code, String description, boolean fdl, int luu, Date uat) {
		this.types = types;
		this.cat = cat;
		this.cbu = cbu;
		this.code = code;
		this.description = description;
		this.fdl = fdl;
		this.luu = luu;
		this.uat = uat;
	}

	public Classes(Types types, Date cat, int cbu, String code, String description, boolean fdl, int luu, Date uat,
			Set<CatalogConcepts> catalogConceptses) {
		this.types = types;
		this.cat = cat;
		this.cbu = cbu;
		this.code = code;
		this.description = description;
		this.fdl = fdl;
		this.luu = luu;
		this.uat = uat;
		this.catalogConceptses = catalogConceptses;
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
	@JoinColumn(name = "id_type", nullable = false)
	public Types getTypes() {
		return this.types;
	}

	public void setTypes(Types types) {
		this.types = types;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classes")
	public Set<CatalogConcepts> getCatalogConceptses() {
		return this.catalogConceptses;
	}

	public void setCatalogConceptses(Set<CatalogConcepts> catalogConceptses) {
		this.catalogConceptses = catalogConceptses;
	}

}
