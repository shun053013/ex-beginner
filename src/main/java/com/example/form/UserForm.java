package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserForm {
	@NotBlank(message = "名前は必須です")
	private String name;
	@NotNull(message = "年齢は必須です")
	private Integer age;
	@Size(min = 1, max = 50, message = "コメントは１文字以上１２７文字以内で入力してください")
	private String comment;

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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
