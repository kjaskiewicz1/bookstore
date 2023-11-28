/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geektextbookratingsapi;


import java.util.Date;
/**
 *
 * @author Wez
 */
public class BookComment {
    private int userId;
    private String comment;
    private final Date datestamp;

    public BookComment(int userId, String comment) {
        this.userId = userId;
        this.comment = comment;
        this.datestamp = new Date();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    public Date getDatestamp() {
        return datestamp;
    }
}
