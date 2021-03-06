/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

/**
 *
 * @author Alcides Lemos
 */

@Entity
public class Tarefa {
    @Id
    private int idTarefa;
    @NotNull(message = "A descrição deve ser preenchida!")
    @Size(min=5, message = "A descrição deve ter pelo menos 5 caracteres")
    private String descricao;
    private boolean finalizado;
    private String dataFinalizacao;

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(String dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public Tarefa(int idTarefas, String descricao, boolean finalizado, String dataFinalizacao) {
        this.idTarefa = idTarefas;
        this.descricao = descricao;
        this.finalizado = finalizado;
        this.dataFinalizacao = dataFinalizacao;
    }
    
    public Tarefa(){
       
    }
    
   @Override
   public String toString(){
       return "Id - " + this.getIdTarefa() + 
               "\nDesc - " + this.getDescricao();
   }
}