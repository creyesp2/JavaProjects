/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlosreyes.bean;

import java.util.Date;

/**
 *
 * @author carlo
 */
public abstract class Publication {

    private String title;
    private Date editionDate;
    private String editorial;
    private String[] authors;

    /**
     * constructor vacio de la clase Publication
     */
    public Publication() {

    }

    /**
     * constructor que contiene los siguientes parametros
     *
     * @param title
     * @param editionDate
     * @param editorial
     * @param authors
     */
    public Publication(String title, Date editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }

    /**
     * metodo getTitle de esta forma empezamos a usar el encapsulamiento
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

}
