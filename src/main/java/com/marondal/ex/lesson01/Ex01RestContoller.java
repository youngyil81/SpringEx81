package com.marondal.ex.lesson01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marondal.ex.lesson01.model.Person;

@RestController // @Controller + @ResponseBody 
@RequestMapping("/lesson01/ex01")
public class Ex01RestContoller {
	
	@RequestMapping("/3")
	public String printString() {
		return "@RestController �׽�Ʈ";
	}
	
	// �츮�� ���� Ŭ������ ��ü ����.
	@RequestMapping("/4")
	public Person printPerson() {
		Person person = new Person();
		person.setName("���α�");
		person.setAge(28);
		return person;
		
	}
	
	@RequestMapping("/5")
	public ResponseEntity<Person> entity(){
		Person person = new Person();
		person.setName("���α�");
		person.setAge(28);
		
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR );
		return entity;
	}
}
