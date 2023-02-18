/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_sys;

/**
 *
 * @author ricky
 */
public class Order extends NewJFrame {
    
    private int ID;
    private String i_name;
    private int qty;
    private int price;
    
    public Order ( int ID, String i_name, int qty, int price ){
        
        this .ID = ID;
        this.i_name=i_name;
        this.qty=qty;
        this.price=price;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getName(){
    return i_name;
    }
    
    public int getQty(){
    return qty;
    }
    
    public int getPrice(){
    return price;
    }
    
    
}
