package com.fundation.ui;




import com.fundation.facade.ProductFacade;
import com.fundation.modelo.Product;
import com.vaadin.annotations.Theme;
import com.vaadin.cdi.CDIUI;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Grid;


import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import javax.ejb.EJB;




@Theme("demo")
@CDIUI("")
public class MyUI extends UI {

   
    @EJB
    private ProductFacade productoService;
    

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        Grid<Product> listaProductos = new Grid<>(Product.class);
        
        listaProductos.setItems(productoService.findAll());
        
        listaProductos.addColumn(Product::getProductCode).setCaption("Código");
        listaProductos.addColumn(Product::getDescription).setCaption("Descripción");
        
        
        
        
        layout.addComponent(listaProductos);
        
        
        
        
        
        setContent(layout);
    }

    


}
