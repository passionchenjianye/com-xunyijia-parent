package com.xunyijia.service.bodytest.service.impl;

import com.xunyijia.service.bodytest.dao.ConstitutionRepository;
import com.xunyijia.service.bodytest.service.ConstitutionService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ConstitutionServiceImpl.java
 * @Description: 体质报告服务操作实现类.
 * @Author: 陈建业
 * @Date: 2017-06-28 21:55
 * @Modified By: Tony
 */
@Service
public class ConstitutionServiceImpl implements ConstitutionService{

  private final Logger logger = Logger.getLogger(ConstitutionServiceImpl.class);

  private final ConstitutionRepository constitutionRepository;

  public ConstitutionServiceImpl(ConstitutionRepository constitutionRepository) {
    this.constitutionRepository = constitutionRepository;
  }

  @Override
  public long count() {
    logger.info("item ------- " + constitutionRepository.count());
    return constitutionRepository.count();
  }
}
