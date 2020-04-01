/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefactura;

/**
 *
 * @author Jhon Edinson Rodríguez Gutierrez
 */
public class Verduras implements FabricaItem {
    private int id;
    private String descripcion;
    private int valor_unit;
    private String type_item;

    public Verduras(int id, String descripcion, int valor_unit, String type_item ){
        this.id = id;
        this.descripcion = descripcion;
        this.valor_unit = valor_unit;
        this.type_item = type_item;
    }

    public Verduras(){

    }


    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getValor_unit() {
        return valor_unit;
    }

    public String getType_item() {
        return type_item;
    }

    public void setValor_unit(int valor_unit) {
        this.valor_unit = valor_unit;
    }

    public void crearItem(int type_item){
        int va = 0;
        va = va +1;
    }

}