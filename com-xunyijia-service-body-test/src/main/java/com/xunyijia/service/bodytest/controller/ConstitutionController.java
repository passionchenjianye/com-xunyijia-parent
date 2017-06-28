package com.xunyijia.service.bodytest.controller;

import com.xunyijia.service.bodytest.service.ConstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConstitutionController.java
 * @Description:
 * @Author: 陈建业
 * @Date: 2017-06-28 22:16
 * @Modified By: Tony
 */
@RestController
@RequestMapping(value = "/constitution")
public class ConstitutionController {

  @Autowired
  private ConstitutionService constitutionService;

  @GetMapping(value = "/count")
  public long constitutionCount() {
    return constitutionService.count();
  }
}
