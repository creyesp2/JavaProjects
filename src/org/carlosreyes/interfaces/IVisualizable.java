/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlosreyes.interfaces;

import java.util.Date;
import org.carlosreyes.bean.Book;
import org.carlosreyes.bean.Magazine;

/**
 *
 * @author carlo
 */
public interface IVisualizable {

    Date startToSee(Date datel);

    void stopToSee(Date datel, Date dateF);

}
