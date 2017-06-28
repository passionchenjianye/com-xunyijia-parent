package com.xunyijia.service.bodytest.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @ClassName: MongodbConfig.java
 * @Description: MongoDB 配置类
 * @Author: 陈建业
 * @Date: 2017-06-28 21:45
 * @Modified By: Tony
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.xunyijia.service.bodytest.dao")
public class MongodbConfig extends AbstractMongoConfiguration {

  @Value(value = "${mongo.dbName}")
  private String dbName;

  @Value(value = "${mongo.host}")
  private String host;

  @Value(value = "${mongo.port}")
  private String port;

  @Override
  protected String getDatabaseName() {
    return dbName;
  }

  @Override
  public Mongo mongo() throws Exception {
    return new MongoClient(host, Integer.parseInt(port));
  }
}
