/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeraTabelas;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pidorodeski
 */
public class GerarTabelas {
    public static void main(String[] args) {
        try{
            EntityManagerFactory em = Persistence.
            createEntityManagerFactory("tarefa"); 
            System.out.println("Criando tabelas no banco...");
            em.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("teste");
        }
    }
    
}
