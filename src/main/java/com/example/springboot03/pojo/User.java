package com.example.springboot03.pojo;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uId
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uName
     *
     * @mbg.generated
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uPwd
     *
     * @mbg.generated
     */
    private String upwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uEmail
     *
     * @mbg.generated
     */
    private String uemail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uAddress
     *
     * @mbg.generated
     */
    private String uaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uPhone
     *
     * @mbg.generated
     */
    private String uphone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uId
     *
     * @return the value of user.uId
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uId
     *
     * @param uid the value for user.uId
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uName
     *
     * @return the value of user.uName
     *
     * @mbg.generated
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uName
     *
     * @param uname the value for user.uName
     *
     * @mbg.generated
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uPwd
     *
     * @return the value of user.uPwd
     *
     * @mbg.generated
     */
    public String getUpwd() {
        return upwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uPwd
     *
     * @param upwd the value for user.uPwd
     *
     * @mbg.generated
     */
    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uEmail
     *
     * @return the value of user.uEmail
     *
     * @mbg.generated
     */
    public String getUemail() {
        return uemail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uEmail
     *
     * @param uemail the value for user.uEmail
     *
     * @mbg.generated
     */
    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uAddress
     *
     * @return the value of user.uAddress
     *
     * @mbg.generated
     */
    public String getUaddress() {
        return uaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uAddress
     *
     * @param uaddress the value for user.uAddress
     *
     * @mbg.generated
     */
    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uPhone
     *
     * @return the value of user.uPhone
     *
     * @mbg.generated
     */
    public String getUphone() {
        return uphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uPhone
     *
     * @param uphone the value for user.uPhone
     *
     * @mbg.generated
     */
    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }
}