package com.mkyong.common.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Studentdetails {
	public ContactInfo getCi() {
		return ci;
	}
	public void setCi(ContactInfo ci) {
		this.ci = ci;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	ContactInfo ci;
	Student st;
}
