package com.learn.cursomc.resources.exceptions;

import java.io.Serializable;
import java.util.Date;

public class StandardError implements Serializable {
	private static final long serialVersionUID = -6496994423107793330L;
	
	private Integer status;
	private String msg;
	private Date stant;
	
	public StandardError(Integer status, String msg, Date stant) {
		super();
		this.status = status;
		this.msg = msg;
		this.stant = stant;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Date getStant() {
		return stant;
	}
	
	public void setStant(Date stant) {
		this.stant = stant;
	}
}