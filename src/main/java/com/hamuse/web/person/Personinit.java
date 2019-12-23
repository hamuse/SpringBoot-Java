package com.hamuse.web.person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class Personinit implements ApplicationRunner {
	private PersonRepository PersonRepository;
	private static final DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
	@Autowired
	public Personinit(PersonRepository PersonRepository) {
		this.PersonRepository = PersonRepository;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = PersonRepository.count();
		if(count == 0) {
			Person person = null;
			String[][] mtx = {{"hong", "1", "홍길동", "1980-01-01"},
							  {"kim", "1", "김유신", "1980-05-05"},
							  {"park", "1", "박지성", "1980-06-05"},
							  {"you", "1", "유관순", "1985-09-09"}
							  };
			/*Person p2 = new Person();
			String[] hong = {"hong", "1", "홍길동", "1980-01-01"};
			String[] kim = {"kim", "1", "김유신", "1980-05-05"};*/
			for(String[] arr : mtx) {
				person = new Person();
				person.setUserid(arr[0]);
				person.setPasswd(arr[1]);
				person.setName(arr[2]);
				person.setBirthday(df.parse(arr[3]));
				PersonRepository.save(person);
			}
			/*for(int i=0; i<mtx.length; i++) {
				person = new Person();
				person.setUserid(mtx[i][0]);
				person.setPasswd(mtx[i][1]);
				person.setName(mtx[i][2]);
				person.setBirthday(df.parse(mtx[i][3]));
				PersonRepository.save(person);
			}*/
		}
	}
}