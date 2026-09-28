/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Student
 */
public abstract class Consoledevices {
    
    String devicetype;
    String storename;
    int totalamount;
    
    Consoledevices(String devicetype,String storename,int totalamount){
    this.devicetype = devicetype;
    this.storename = storename;
    this.totalamount = totalamount;
    
    
    }
    
}
