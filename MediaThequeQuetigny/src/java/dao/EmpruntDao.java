/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import model.Emprunt;

/**
 *
 * @author alex-dev
 */
@Stateless
public class EmpruntDao extends DAO_IMPL<Emprunt>{
    
    
    public EmpruntDao()
    {
        super(Emprunt.class);
    }
    
}