/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.shoesshi.service;

import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

/**
 *
 * @author TuanPNTSE173039
 */
@Named("re")
public class RestService implements MyService {

  @Override
  public String sayHello(String message) {
    return "This is new Service. My name is " + message;
  }
}
