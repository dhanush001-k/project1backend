package com.example.Project1CC1.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Project1CC1.Entity.EntityDetails;

import jakarta.transaction.Transactional;
@Repository
public interface gRepo extends JpaRepository<EntityDetails,Integer> {
	@Query(value="select * from game_details where gid=:a or gname=:b",nativeQuery=true)
	public List<EntityDetails>getGameInfo(@Param("a") int gid,@Param("b") String gname);

	@Modifying
	@Transactional
	@Query(value="delete from game_details where gid=:g",nativeQuery=true)
	public Integer deleteGameInfo(@Param("g") int gid);
	
	@Modifying
	@Transactional
	@Query(value="update game_details m set m.gid =:g where m.gid=:g1",nativeQuery=true)
	public Integer updateGameInfo(@Param("g") int gid,@Param("g1") int newid);

	

}
