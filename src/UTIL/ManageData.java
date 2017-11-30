/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

import java.util.ArrayList;
import java.util.HashMap;

public class ManageData {
    private HashMap<String, Integer> pesos;
    private ArrayList<Base> base;
    private ArrayList<Atributo> atributos;
    
    public ManageData(){
        pesos = new HashMap<>();
        base = new ArrayList<>();
        atributos = new ArrayList<>();
    }
    public HashMap<String, Integer> getPesos() {
        return pesos;
    }
    public void setPesos(HashMap<String, Integer> pesos) {
        this.pesos = pesos;
    }
    public ArrayList<Base> getBase() {
        return base;
    }
    public void setBase(ArrayList<Base> base) {
        this.base = base;
    }
    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }
    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }
    
}
