/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alcides Lemos
 */
public class GeraTabelas {

  public static void main(String[] args) {
    try{
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefa");
        factory.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
  }
}