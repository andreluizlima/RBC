package UTIL;

public class AtbValue {

    private String atributo;
    private String valor;
    
    public AtbValue(String atributo, String valor) {
        this.atributo = atributo;
        this.valor = valor;
    }
    //________________________________________________
    
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    @Override
    public String toString(){
        String r = "Atributo: "+atributo+" | Valor: "+valor;
        return r;
    }

}
