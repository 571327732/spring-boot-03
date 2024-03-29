package com.example.springboot03.pojo;

import java.util.Date;

public class Flower {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flowers.fId
     *
     * @mbg.generated
     */
    private Integer fid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flowers.fName
     *
     * @mbg.generated
     */
    private String fname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flowers.fPrice
     *
     * @mbg.generated
     */
    private Long fprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flowers.fImgPath
     *
     * @mbg.generated
     */
    private String fimgpath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flowers.fSheifTime
     *
     * @mbg.generated
     */
    private Date fsheiftime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flowers.fCount
     *
     * @mbg.generated
     */
    private Integer fcount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flowers.fId
     *
     * @return the value of flowers.fId
     *
     * @mbg.generated
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flowers.fId
     *
     * @param fid the value for flowers.fId
     *
     * @mbg.generated
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flowers.fName
     *
     * @return the value of flowers.fName
     *
     * @mbg.generated
     */
    public String getFname() {
        return fname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flowers.fName
     *
     * @param fname the value for flowers.fName
     *
     * @mbg.generated
     */
    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flowers.fPrice
     *
     * @return the value of flowers.fPrice
     *
     * @mbg.generated
     */
    public Long getFprice() {
        return fprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flowers.fPrice
     *
     * @param fprice the value for flowers.fPrice
     *
     * @mbg.generated
     */
    public void setFprice(Long fprice) {
        this.fprice = fprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flowers.fImgPath
     *
     * @return the value of flowers.fImgPath
     *
     * @mbg.generated
     */
    public String getFimgpath() {
        return fimgpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flowers.fImgPath
     *
     * @param fimgpath the value for flowers.fImgPath
     *
     * @mbg.generated
     */
    public void setFimgpath(String fimgpath) {
        this.fimgpath = fimgpath == null ? null : fimgpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flowers.fSheifTime
     *
     * @return the value of flowers.fSheifTime
     *
     * @mbg.generated
     */
    public Date getFsheiftime() {
        return fsheiftime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flowers.fSheifTime
     *
     * @param fsheiftime the value for flowers.fSheifTime
     *
     * @mbg.generated
     */
    public void setFsheiftime(Date fsheiftime) {
        this.fsheiftime = fsheiftime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flowers.fCount
     *
     * @return the value of flowers.fCount
     *
     * @mbg.generated
     */
    public Integer getFcount() {
        return fcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flowers.fCount
     *
     * @param fcount the value for flowers.fCount
     *
     * @mbg.generated
     */
    public void setFcount(Integer fcount) {
        this.fcount = fcount;
    }
}