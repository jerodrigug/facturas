/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefactura;

import javax.swing.*;

/**
 *
 * @author Jhon Edinson Rodríguez Gutierrez
 */
public class FabricaMaker {


    public void crearItem (int idItem){
        switch(idItem){

            case 1:
                 new Verduras();
            case 2:
                //return new Carnes();
            case 3:
                //return  new Enlatados();
            case 4:
                //return new Lacteos();
            case 5:
                //return new Dulces();
            default:
                throw new IllegalArgumentException("Tipo de item no soportado");
        }
    }
}