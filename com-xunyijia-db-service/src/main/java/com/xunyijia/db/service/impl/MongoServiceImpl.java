package com.xunyijia.db.service.impl;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.xunyijia.db.service.MongoService;
import org.bson.Document;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MongoServiceImpl.java
 * @Description:
 * @Author: 陈建业
 * @Date: 2017-06-27 23:15
 * @Modified By: Tony
 */
@Service
public class MongoServiceImpl implements MongoService {

  private MongoCollection<Document> collection;

  @Override
  public void connect(String dbName, String collectionName, String host, int port) {
    MongoClient client = new MongoClient(host, port);
    MongoDatabase database = client.getDatabase(dbName);
    collection = database.getCollection(collectionName);
  }

  @Override
  public void insert(Document document) {
    collection.insertOne(document);
  }
}
