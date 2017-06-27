package com.xunyijia.db.service;

import org.bson.Document;

/**
 * @ClassName: MongoService.java
 * @Description: MongoDB操作类
 * @Author: 陈建业
 * @Date: 2017-06-27 22:30
 * @Modified By: Tony
 */
public interface MongoService {

  /**
   * 连接MongoDB数据库.
   * @param dbName 数据库名称
   * @param collectionName 集合名称
   * @param host 主机名
   * @param port 端口
   */
  public void connect(String dbName, String collectionName, String host, int port);

  /**
   * 插入文档
   * @param document 文档
   */
  public void insert(Document document);

}
