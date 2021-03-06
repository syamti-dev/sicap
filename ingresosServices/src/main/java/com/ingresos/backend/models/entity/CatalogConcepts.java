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
 * CatalogConcepts generated by hbm2java
 */
@Entity
@Table(name = "catalog_concepts", catalog = "ingresosdb")
public class CatalogConcepts implements java.io.Serializable {

	private Integer id;
	private CatalogsSubfundingSources catalogsSubfundingSources;
	private Classes classes;
	private TypeResources typeResources;
	private Date cat;
	private int cbu;
	private boolean fdl;
	private String idBase36;
	private String idExternal;
	private int luu;
	private String name;
	private Date uat;
	private Date year;

	public CatalogConcepts() {
	}

	public CatalogConcepts(CatalogsSubfundingSources catalogsSubfundingSources, Classes classes,
			TypeResources typeResources, Date cat, int cbu, boolean fdl, String idBase36, String idExternal, int luu,
			String name, Date uat, Date year) {
		this.catalogsSubfundingSources = catalogsSubfundingSources;
		this.classes = classes;
		this.typeResources = typeResources;
		this.cat = cat;
		this.cbu = cbu;
		this.fdl = fdl;
		this.idBase36 = idBase36;
		this.idExternal = idExternal;
		this.luu = luu;
		this.name = name;
		this.uat = uat;
		this.year = year;
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
	@JoinColumn(name = "id_subfunding_source", nullable = false)
	public CatalogsSubfundingSources getCatalogsSubfundingSources() {
		return this.catalogsSubfundingSources;
	}

	public void setCatalogsSubfundingSources(CatalogsSubfundingSources catalogsSubfundingSources) {
		this.catalogsSubfundingSources = catalogsSubfundingSources;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_class", nullable = false)
	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_type_resource", nullable = false)
	public TypeResources getTypeResources() {
		return this.typeResources;
	}

	public void setTypeResources(TypeResources typeResources) {
		this.typeResources = typeResources;
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

	@Column(name = "id_base36", nullable = false, length = 8)
	public String getIdBase36() {
		return this.idBase36;
	}

	public void setIdBase36(String idBase36) {
		this.idBase36 = idBase36;
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

	@Column(name = "name", nullable = false, length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "uat", nullable = false, length = 19)
	public Date getUat() {
		return this.uat;
	}

	public void setUat(Date uat) {
		this.uat = uat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "year", nullable = false, length = 10)
	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

}
