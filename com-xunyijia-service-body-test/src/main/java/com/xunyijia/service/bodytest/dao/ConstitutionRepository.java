package com.xunyijia.service.bodytest.dao;

import com.xunyijia.service.bodytest.entity.Constitution;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName: ConstitutionRepository.class
 * @Description: 体质报告数据库操作.
 * @Author: Tony
 * @Date: 2017-06-28 21:35
 */
public interface ConstitutionRepository extends CrudRepository<Constitution, Long> {

}
