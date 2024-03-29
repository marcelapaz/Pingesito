/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.Farmaco;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Holiwi-PC
 */
@Local
public interface FarmacoFacadeLocal {

    void create(Farmaco farmaco);

    void edit(Farmaco farmaco);

    void remove(Farmaco farmaco);

    Farmaco find(Object id);

    List<Farmaco> findAll();

    List<Farmaco> findRange(int[] range);

    int count();
    
}
