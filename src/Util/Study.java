/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Cleiton
 */
public class Study {
    private  String author, title, content;
    private Boolean values;
    private double ref = 1.0;

    public Boolean getValues() {
        return values;
    }

    public void setValues(Boolean values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "("+author+", "+title+")";
    }
    
    

    public Study(String author, String title, String content, Boolean values) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.values = values;
        
    }

    public double getRef() {
        return ref;
    }

    public Study() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

   
    
}
