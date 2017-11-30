package UTIL;

import java.util.ArrayList;

public class Base {
   
   private static int id = 1;
   private ArrayList<AtbValue> baseData;
   private int idP;
   
   public Base(){
       baseData = new ArrayList<>();
       idP=id;
       id++;
   }
    public ArrayList<AtbValue> getBaseData() {
        return baseData;
    }
    public void setBaseData(ArrayList<AtbValue> baseData) {
        this.baseData = baseData;
    }
    public void toStringA(){
        for(int i=0; i<baseData.size();i++ ){
            System.out.println(baseData.get(i).toString());
        }
    }

    public int getId() {
        return idP;
    }
    public void setId(int idP) {
        this.idP = idP;
    }
   
   
}
