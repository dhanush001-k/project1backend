package com.example.Project1CC1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project1CC1.Entity.EntityDetails;
import com.example.Project1CC1.Service.gService;
@CrossOrigin
@RestController
public class Controller {
	@Autowired
	gService gameService;
	@PostMapping("/add1Details")
	public EntityDetails addInfo(@RequestBody EntityDetails g) {
		return gameService.saveDetails(g);
	}
	@GetMapping("/get1Details")
	public List<EntityDetails> fetchDetails(){
		return gameService.getDetails();
	}
	@PutMapping("/update1Details")
	public EntityDetails updateInfo(@RequestBody EntityDetails g) {
		return gameService.saveDetails(g);
	}
	@DeleteMapping("/delete/{gid}")
	public String deleteInfo(@PathVariable("gid") int gid) {
		gameService.deleteDetails(gid);
		return "Deleted details";
	}
	@PostMapping("/post")
    public String addDetails(@RequestBody EntityDetails m)
    {
    	gameService.add(m);
    	return "Added product " +m.getGid();
    }
    
    @GetMapping("/product/{field}")
    public List<EntityDetails> getWithSort(@PathVariable String field)
    {
    	return gameService.getSorted(field);
    }
    
    @GetMapping("/product/{offset}/{pageSize}")
    public List<EntityDetails> productsWithPagination(@PathVariable int offset,@PathVariable int pageSize)
    {
    	return gameService.getWithPagination(offset,pageSize);
    }
    
    
    
    
    @GetMapping("/getnew/{gid}/{gname}")
	public List <EntityDetails> displayAll(@PathVariable("g") int a,@PathVariable("g1") String b){
		return gameService.getDetails(a,b);
	}
	
	@DeleteMapping("/deletenew/{gid}")
	public String deleteInfo1(@PathVariable("gid") int g){
		gameService.deleteDetails1(g);
		return "Deleted";
	}
	
	@PutMapping("/update/{gid}/{gid1}")
	public String updateInfo(@PathVariable("gid") int g,@PathVariable("gid1") int g1){
		gameService.updateDetails1(g,g1);
		return "Updated";
	}

}

