/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fundation.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Ricardo
 */
@Stateless
public class DataService {
    
    @EJB
    private ProductFacade productoService;
    
    public ProductFacade getProductoService(){
        return productoService;
    }
    
}
