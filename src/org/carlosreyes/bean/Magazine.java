/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlosreyes.bean;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class Magazine extends Publication {

    private int id;

    public Magazine() {
    }

    public Magazine(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Magazine" + this.getTitle() + "-" + this.getEditorial();
    }

    public static ArrayList<Magazine> makeMagazineList() {
        return null;
    }

}
