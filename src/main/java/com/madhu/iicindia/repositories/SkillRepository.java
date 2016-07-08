package com.madhu.iicindia.repositories;

import com.madhu.iicindia.entity.Skill;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by madhu on 04/07/16.
 */


public interface SkillRepository extends CrudRepository<Skill, Long> {

public List<Skill> findByLable(String label);


}
