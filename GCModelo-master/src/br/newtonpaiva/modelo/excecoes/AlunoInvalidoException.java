/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.modelo.excessoes;

/**
 *
 * @author pablo
 */
public class AlunoInvalidoException extends Exception {
     public AlunoInvalidoException(String msg){
        //super operador que chama a superclasse
        super(msg);
    }
    
}
