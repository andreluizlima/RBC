/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

/**
 *
 * @author andre
 */
public class main {
    public static void main(String[] args) {
        DataAccess teste = new DataAccess();
        teste.setBase("base.csv");
        teste.setPesos("pesos.csv");
        teste.setAtributos("atributos.csv");
        Atributo at = teste.getBaseCompleta().getAtributos().get(0);
        System.out.println(at.getValor().get(teste.getAtrbName().get(1)));
    }
}
