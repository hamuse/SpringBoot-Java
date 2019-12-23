package com.hamuse.web.person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamuse.web.util.Printer;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private Printer printer;
	@Autowired
	private Person person;
	
	@RequestMapping("/")
	public String index() {
		Iterable<Person> all = personRepository.findAll();
		StringBuilder sb = new StringBuilder();
		all.forEach(p -> sb.append(p.getName()+" "));
		return sb.toString();
	}
	@PostMapping("/login")
	public HashMap<String,Object> login(@RequestBody Person person) {
		HashMap<String,Object> map = new HashMap<>();
		printer.accept("로그인 진입");
		printer.accept(String.format("USERID: %s", person.getUserid()));
		printer.accept(String.format("PASSWD: %s", person.getPasswd()));
		person = personRepository.findByUseridAndPasswd(
				person.getUserid(),
				person.getPasswd());
		if(person != null) {
			printer.accept("로그인성공");
			map.put("result", "SUCCESS");
			map.put("person",person);
		}else {
			map.put("result", "FAIL");
			map.put("person",person);
		}
		return map;
	}
	
	@PostMapping("/join")
	public HashMap<String,Object> join(@RequestBody Person person){
		HashMap<String,Object> map = new HashMap<>();
		/* DateFormat dateformat = new SimpleDateFormat(); */
		printer.accept("조인 컨트롤러 진입");
		printer.accept(person.getUserid());
		printer.accept(person.getPasswd());
		printer.accept(person.getName());
		/* printer.accept(person.getBirthday()); 불러왔을때 형식이 데이터 형식이라 아예 안불러 오던가 스트링 형식으로 바껴야 저장이된다. */
		 String birthday = String.valueOf(person.getBirthday());
		 printer.accept(birthday);
		
		personRepository.save(person);
		
		
		
		return map;
	}
	//userid,passwd,name,birthday
}
