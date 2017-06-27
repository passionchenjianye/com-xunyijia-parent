package com.xunyijia.db.controller;

import com.xunyijia.db.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: MongoController.java
 * @Description:
 * @Author: 陈建业
 * @Date: 2017-06-27 22:41
 * @Modified By: Tony
 */
@RestController
public class MongoController {

  @Autowired
  private MongoService mongoService;

  @Value("${dbName}")
  String dbName;

  @Value("${host}")
  String host;

  @Value("${port}")
  int port;

  public MongoController(String collectionName) {

  }

  @GetMapping(value = "/db")
  public void insert(){
    System.out.println("dbname === " + dbName);
    System.out.println("host === " + host);
    System.out.println("port === " + port);
  }

}
