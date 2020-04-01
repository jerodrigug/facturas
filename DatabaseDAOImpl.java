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

import java.util.List;
public class DatabaseDAOImpl {
    Database Db = new Database();

    public DatabaseDAOImpl() {
        Db = Database.getDatabase();
    }


    public void registrarCliente(Cliente cliente) {
        String res = Db.añadirCliente(cliente);
        System.out.println(res);
    }


    public void eliminarCliente(int id) {
        String res = Db.eliminarCliente(id);
        System.out.println(res);
    }


    public Cliente buscarCliente(int id) {
        return Db.buscarCliente(id);
    }


    public List<Cliente> buscarClientes() {
        return Db.listaClientes();
    }


    public void registrarFactura(softwarefactura.Factura factura) {
        String res = Db.añadirFactura(factura);
        System.out.println(res);
    }


    public Factura buscarFactura(int nroFactura) {
        return Db.buscarFactura(nroFactura);
    }


    public List<Factura> buscarFacturas() {
        return Db.listaFacturas();
    }


    public void registrarItem(softwarefactura.Item item) {
        String res = Db.añadirItem(item);
        System.out.println(res);
    }


    public Item buscarItem(int id) {
        return Db.buscarItem(id);
    }


    public void eliminarItem(int id) {
        String res = Db.eliminarItem(id);
        System.out.println(res);
    }


    public void eliminarTipoItem(int id) {
        String res = Db.eliminarTipoItem(id);
        System.out.println(res);
    }


    public void registrarTipoItem(TipoItem tipoItem) {
        String res = Db.añadirTipoItem(tipoItem);
        System.out.println(res);
    }


    public TipoItem buscarTipoItem(int id) {
        return Db.buscarTipoItem(id);
    }
}
