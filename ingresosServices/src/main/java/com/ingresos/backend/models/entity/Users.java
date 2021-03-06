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
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "ingresosdb")
public class Users implements java.io.Serializable {

	private Integer id;
	private Date cat;
	private int cbu;
	private String cellphone;
	private String curp;
	private String email;
	private boolean fdl;
	private String firstName;
	private String ine;
	private Boolean isInternet;
	private Boolean isMobile;
	private String lastName;
	private String login;
	private int luu;
	private String name;
	private String password;
	private String photo;
	private Date registrationDate;
	private String rfc;
	private String telephone;
	private Date uat;
	private int idArea;
	private int idEntityOffice;

	public Users() {
	}

	public Users(Date cat, int cbu, boolean fdl, String login, int luu, String name, String password,
			Date registrationDate, String rfc, Date uat, int idArea, int idEntityOffice) {
		this.cat = cat;
		this.cbu = cbu;
		this.fdl = fdl;
		this.login = login;
		this.luu = luu;
		this.name = name;
		this.password = password;
		this.registrationDate = registrationDate;
		this.rfc = rfc;
		this.uat = uat;
		this.idArea = idArea;
		this.idEntityOffice = idEntityOffice;
	}

	public Users(Date cat, int cbu, String cellphone, String curp, String email, boolean fdl, String firstName,
			String ine, Boolean isInternet, Boolean isMobile, String lastName, String login, int luu, String name,
			String password, String photo, Date registrationDate, String rfc, String telephone, Date uat, int idArea,
			int idEntityOffice) {
		this.cat = cat;
		this.cbu = cbu;
		this.cellphone = cellphone;
		this.curp = curp;
		this.email = email;
		this.fdl = fdl;
		this.firstName = firstName;
		this.ine = ine;
		this.isInternet = isInternet;
		this.isMobile = isMobile;
		this.lastName = lastName;
		this.login = login;
		this.luu = luu;
		this.name = name;
		this.password = password;
		this.photo = photo;
		this.registrationDate = registrationDate;
		this.rfc = rfc;
		this.telephone = telephone;
		this.uat = uat;
		this.idArea = idArea;
		this.idEntityOffice = idEntityOffice;
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

	@Column(name = "cellphone", length = 20)
	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Column(name = "curp", length = 20)
	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "fdl", nullable = false)
	public boolean isFdl() {
		return this.fdl;
	}

	public void setFdl(boolean fdl) {
		this.fdl = fdl;
	}

	@Column(name = "first_name", length = 100)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "ine", length = 20)
	public String getIne() {
		return this.ine;
	}

	public void setIne(String ine) {
		this.ine = ine;
	}

	@Column(name = "is_internet")
	public Boolean getIsInternet() {
		return this.isInternet;
	}

	public void setIsInternet(Boolean isInternet) {
		this.isInternet = isInternet;
	}

	@Column(name = "is_mobile")
	public Boolean getIsMobile() {
		return this.isMobile;
	}

	public void setIsMobile(Boolean isMobile) {
		this.isMobile = isMobile;
	}

	@Column(name = "last_name", length = 100)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "login", nullable = false, length = 20)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "luu", nullable = false)
	public int getLuu() {
		return this.luu;
	}

	public void setLuu(int luu) {
		this.luu = luu;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "photo")
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "registration_date", nullable = false, length = 19)
	public Date getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Column(name = "rfc", nullable = false, length = 15)
	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Column(name = "telephone", length = 20)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "uat", nullable = false, length = 19)
	public Date getUat() {
		return this.uat;
	}

	public void setUat(Date uat) {
		this.uat = uat;
	}

	@Column(name = "id_area", nullable = false)
	public int getIdArea() {
		return this.idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	@Column(name = "id_entity_office", nullable = false)
	public int getIdEntityOffice() {
		return this.idEntityOffice;
	}

	public void setIdEntityOffice(int idEntityOffice) {
		this.idEntityOffice = idEntityOffice;
	}

}
