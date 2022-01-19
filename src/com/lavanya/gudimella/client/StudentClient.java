package com.lavanya.gudimella.client;

import java.rmi.RemoteException;

import com.lavanya.gudimella.service.StudentServiceProxy;

public class StudentClient {
	public static void main(String[] args) throws RemoteException {
		StudentServiceProxy studentServiceProxy = new StudentServiceProxy();
		
		studentServiceProxy.getAllStudents();
		studentServiceProxy.deleteStudent(10);
		System.out.println(studentServiceProxy.getStudentById(9));
		studentServiceProxy.updateStudent(11, "something 123");
	}
}
