package com.pawana.stack.post.util;

import java.util.ArrayList;
import java.util.List;

import com.pawana.stack.post.entities.User;

public class APIResponse<T> {
   private Status status=new Status();
   private T payLoad;
   private List<ErrorInfo> errorInfo=new ArrayList<>();
   public APIResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
public Status getStatus() {
	return status;
}
public void setStatus(Status status) {
	this.status = status;
}
public T getPayLoad() {
	return payLoad;
}
public void setPayLoad(T payLoad) {
	this.payLoad = payLoad;
}
public List getErrorInfo() {
	return errorInfo;
}
public void setErrorInfo(List errorInfo) {
	this.errorInfo = errorInfo;
}

   
   
   
}
