/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;



/**
 *
 * @author danie
 */
public interface metodos <Generic>{
    public boolean create (Generic g);
    
    public Generic read(Object key);
    public ArrayList<Generic> readAll();
    
}
