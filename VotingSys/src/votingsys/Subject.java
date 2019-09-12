/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsys;

/**
 *
 * @author MACHINE
 */
public interface Subject {
    
    void Attach(Observer O);
    void Dettach(Observer O);
    void Notify();
    
}
