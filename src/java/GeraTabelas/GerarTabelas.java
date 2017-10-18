/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeraTabelas;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 00177901
 */
public class GerarTabelas {
    public static void main(String[] args) {
        EntityManagerFactory em = Persistence.
            createEntityManagerFactory("WebApplication-Spring-3anoPU");
            
    System.out.println("Criando tabelas no banco...");
    
    em.close();
    }
    
}
