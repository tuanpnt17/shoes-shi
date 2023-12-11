/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.shoesshi.service;

import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

/**
 *
 * @author TuanPNTSE173039
 */
//@Default
@Named("tu")
@Alternative
public class TuanPNTService implements MyService {

  @Override
  public String sayHello(String message) {
    return "Hello " + message;
  }

}
