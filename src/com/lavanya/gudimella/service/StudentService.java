/**
 * StudentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lavanya.gudimella.service;

public interface StudentService extends java.rmi.Remote {
    public void addStudent() throws java.rmi.RemoteException;
    public java.lang.String getAllStudents() throws java.rmi.RemoteException;
    public com.lavanya.gudimella.dto.Student getStudentById(int id) throws java.rmi.RemoteException;
    public void updateStudent(int id, java.lang.String address) throws java.rmi.RemoteException;
    public void deleteStudent(int id) throws java.rmi.RemoteException;
}
