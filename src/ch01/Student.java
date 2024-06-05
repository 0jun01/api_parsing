package ch01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

	private String name;
	private int age;
	private String major;

	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

}
