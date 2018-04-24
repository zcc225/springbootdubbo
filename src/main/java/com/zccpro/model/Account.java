package com.zccpro.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Account implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.company_code
     *
     * @mbg.generated
     */
    private String companyCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.basic_account
     *
     * @mbg.generated
     */
    private BigDecimal basicAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.gift_account
     *
     * @mbg.generated
     */
    private BigDecimal giftAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.insert_time
     *
     * @mbg.generated
     */
    private Date insertTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.uid
     *
     * @return the value of account.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.uid
     *
     * @param uid the value for account.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.company_code
     *
     * @return the value of account.company_code
     *
     * @mbg.generated
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.company_code
     *
     * @param companyCode the value for account.company_code
     *
     * @mbg.generated
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.basic_account
     *
     * @return the value of account.basic_account
     *
     * @mbg.generated
     */
    public BigDecimal getBasicAccount() {
        return basicAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.basic_account
     *
     * @param basicAccount the value for account.basic_account
     *
     * @mbg.generated
     */
    public void setBasicAccount(BigDecimal basicAccount) {
        this.basicAccount = basicAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.gift_account
     *
     * @return the value of account.gift_account
     *
     * @mbg.generated
     */
    public BigDecimal getGiftAccount() {
        return giftAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.gift_account
     *
     * @param giftAccount the value for account.gift_account
     *
     * @mbg.generated
     */
    public void setGiftAccount(BigDecimal giftAccount) {
        this.giftAccount = giftAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.insert_time
     *
     * @return the value of account.insert_time
     *
     * @mbg.generated
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.insert_time
     *
     * @param insertTime the value for account.insert_time
     *
     * @mbg.generated
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.update_time
     *
     * @return the value of account.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.update_time
     *
     * @param updateTime the value for account.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", companyCode=").append(companyCode);
        sb.append(", basicAccount=").append(basicAccount);
        sb.append(", giftAccount=").append(giftAccount);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}