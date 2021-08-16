package com.study.spring.case03.model;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:user.properties")
public class User {
	
	//@Value(value = "John")
	@Value("${user.name1}")
	private String name;
	
	//@Value(value = "18")
	@Value("${user.age}")
	private Integer age;
	
	//@Value("#{${subjects : {'國文','英文','數學'}}}")	// Spring EL
	@Value("${user.subjects}")
	private Set<String> subjects;
	
	//@Value("#{${nickname : {'Happy','Enjoy'}}}")
	@Value("${user.nickname}")
	private String[] nickname;	// 暱稱
	
	//@Value("#{${scores : {100 , 90 , 100}}}")
	@Value("#{'${user.scores}'.split(',')}")
	private List<Integer> scores;	// 成績
	
	//@Value("#{${hobbies : {key1:'旅遊' , key2:'看書'}}}")
	@Value("#{${user.hobbies}}")
	private Map<String, String> hobbies;	// 科目

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	public String[] getNickname() {
		return nickname;
	}

	public void setNickname(String[] nickname) {
		this.nickname = nickname;
	}

	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}

	public Map<String, String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Map<String, String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", subjects=" + subjects + ", nickname="
				+ Arrays.toString(nickname) + ", scores=" + scores + ", hobbies=" + hobbies + "]";
	}
	
	
}
