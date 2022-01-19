package com.lavanya.gudimella.service;

public class StudentServiceProxy implements com.lavanya.gudimella.service.StudentService {
  private String _endpoint = null;
  private com.lavanya.gudimella.service.StudentService studentService = null;
  
  public StudentServiceProxy() {
    _initStudentServiceProxy();
  }
  
  public StudentServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudentServiceProxy();
  }
  
  private void _initStudentServiceProxy() {
    try {
      studentService = (new com.lavanya.gudimella.service.StudentServiceServiceLocator()).getStudentService();
      if (studentService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)studentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)studentService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (studentService != null)
      ((javax.xml.rpc.Stub)studentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lavanya.gudimella.service.StudentService getStudentService() {
    if (studentService == null)
      _initStudentServiceProxy();
    return studentService;
  }
  
  public void addStudent() throws java.rmi.RemoteException{
    if (studentService == null)
      _initStudentServiceProxy();
    studentService.addStudent();
  }
  
  public java.lang.String getAllStudents() throws java.rmi.RemoteException{
    if (studentService == null)
      _initStudentServiceProxy();
    return studentService.getAllStudents();
  }
  
  public com.lavanya.gudimella.dto.Student getStudentById(int id) throws java.rmi.RemoteException{
    if (studentService == null)
      _initStudentServiceProxy();
    return studentService.getStudentById(id);
  }
  
  public void updateStudent(int id, java.lang.String address) throws java.rmi.RemoteException{
    if (studentService == null)
      _initStudentServiceProxy();
    studentService.updateStudent(id, address);
  }
  
  public void deleteStudent(int id) throws java.rmi.RemoteException{
    if (studentService == null)
      _initStudentServiceProxy();
    studentService.deleteStudent(id);
  }
  
  
}