package com.zccpro.dao;

import com.zccpro.model.Account;
import java.util.List;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    Account selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    List<Account> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Account record);
}