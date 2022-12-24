package com.zzw.dianping.dal;

import com.zzw.dianping.model.sellerModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface sellerModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbg.generated Fri Jul 19 12:00:18 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbg.generated Fri Jul 19 12:00:18 CST 2019
     */
    int insert(sellerModel record);

    List<sellerModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbg.generated Fri Jul 19 12:00:18 CST 2019
     */
    int insertSelective(sellerModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbg.generated Fri Jul 19 12:00:18 CST 2019
     */
    sellerModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbg.generated Fri Jul 19 12:00:18 CST 2019
     */
    int updateByPrimaryKeySelective(sellerModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbg.generated Fri Jul 19 12:00:18 CST 2019
     */
    int updateByPrimaryKey(sellerModel record);
}