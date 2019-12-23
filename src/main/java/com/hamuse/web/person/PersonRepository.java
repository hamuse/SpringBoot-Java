package com.hamuse.web.person;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepository extends CrudRepository<Person,Long>{
	public Person findByUseridAndPasswd(String userid, String passwd);
	public Person findByUseridAndPasswdAndNameAndBirthday(String userid, String passwd, String name, Date birthday );
}
