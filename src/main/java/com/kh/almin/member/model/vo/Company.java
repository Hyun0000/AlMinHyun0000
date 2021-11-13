package com.kh.almin.member.model.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class Company {
	private String companyId;
	private String companyType;
	private String companyPwd;
	private String companyTel;
	private String companyName;
	private String companyBoss;
	private String companyEmail;
	private String companyAddress;
	private String companyNum;
}
