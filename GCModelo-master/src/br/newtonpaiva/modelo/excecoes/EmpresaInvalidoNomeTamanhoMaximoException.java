/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.modelo.excecoes;

/**
 *
 * @author Guilherme
 */
public class EmpresaInvalidoNomeTamanhoMaximoException extends Exception {

    public EmpresaInvalidoNomeTamanhoMaximoException(String msg) {
        super(msg);
    }
}