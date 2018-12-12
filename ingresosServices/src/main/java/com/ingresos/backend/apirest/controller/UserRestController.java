package com.ingresos.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingresos.backend.models.bean.UserBean;
import com.ingresos.backend.models.entity.Users;
import com.ingresos.backend.models.service.IUserService;
import com.ingresos.backend.util.DaoUtil;


@CrossOrigin(origins= {"http://locahots:4200"})
@RestController
@RequestMapping ("/api")
public class UserRestController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/getUserAll")
	public ResponseEntity<List<Users>> getUserAll(@RequestHeader(value="apiKey") String apiKey){
		
		if (apiKey.equals("boot"))
			return  new ResponseEntity<List<Users>>(userService.findAll(), HttpStatus.OK);
		else
			return new ResponseEntity<List<Users>>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping ("/addUser")
	public ResponseEntity<Void> addUser (@RequestBody UserBean userBean) {
		
		Users user= new Users();
		
		user.setName(userBean.getName());
		user.setFirstName(userBean.getFirstName());
		user.setLastName(userBean.getLastName());
		user.setRfc(userBean.getRfc());
		user.setCurp(userBean.getCurp());
		user.setIne(userBean.getIne());
		user.setIsInternet(userBean.getIsInternet());
		user.setIsMobile(userBean.getIsMobile());
		user.setLogin(userBean.getLogin());
		user.setPassword(userBean.getPassword());
		user.setPhoto(userBean.getPhoto());
		user.setRegistrationDate(userBean.getRegistrationDate());
		user.setCellphone(userBean.getCellphone());
		user.setTelephone(userBean.getTelephone());
		user.setEmail(userBean.getEmail());
		user.setIdArea(userBean.getIdArea());
		user.setIdEntityOffice(userBean.getIdEntityOffice());
		
		DaoUtil.prepareToSave(user, 1);
		
		System.out.println(user.getRegistrationDate());
		
		userService.saveorUpdate(user);
		 //return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);	
	}
	
	/*
	@PutMapping("article")
	public ResponseEntity<ArticleInfo> updateArticle(@RequestBody ArticleInfo articleInfo) {
		Article article = new Article();
		BeanUtils.copyProperties(articleInfo, article);		
		articleService.updateArticle(article);
		
		ArticleInfo ob = new ArticleInfo();
		BeanUtils.copyProperties(article, ob);
		return new ResponseEntity<ArticleInfo>(ob, HttpStatus.OK);
	}
	
	//Deletes article by id
	@DeleteMapping("article/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		articleService.deleteArticle(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}*/
	

}
