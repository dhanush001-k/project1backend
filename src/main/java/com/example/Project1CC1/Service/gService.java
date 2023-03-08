package com.example.Project1CC1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Project1CC1.Entity.EntityDetails;
import com.example.Project1CC1.Repository.gRepo;
@Service
public class gService {
	@Autowired
	gRepo gameRepo;
	public EntityDetails saveDetails(EntityDetails e) {
		return gameRepo.save(e);
	}
	public List<EntityDetails> getDetails(){
		return gameRepo.findAll();
	}
	public EntityDetails updateDetails(EntityDetails e1) {
		return gameRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int gid) {
		gameRepo.deleteById(gid);
	}
	public String add(EntityDetails m)
    {
   	 gameRepo.save(m);
   	 return "Added";
    }
    public List<EntityDetails> getSorted(String field)
    {
   	 return gameRepo.findAll(Sort.by(Sort.Direction.ASC,field));
    }
    public List<EntityDetails> getWithPagination(@PathVariable int offset,@PathVariable int pageSize)
    {
   	 Page<EntityDetails> page=gameRepo.findAll(PageRequest.of(offset, pageSize));
   	 return page.getContent();
    }
    
    public List <EntityDetails> getDetails(int a,String b){
		return gameRepo.getGameInfo(a, b);
	}
	
	public Integer deleteDetails1(int g){
		return gameRepo.deleteGameInfo(g);
	}
	
	public Integer updateDetails1(int g,int g1){
		return gameRepo.updateGameInfo(g,g1);
	}
    
    
}