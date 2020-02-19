/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Index;

/**
 *
 * @author ubuntu
 */
public class Entrada_Salida {
  
    private String numA;
    private int baseA;
    private int baseB;
    private String ResultadoEntero;
    
    public Entrada_Salida(){
        
    }
    
    public Entrada_Salida(int baseA, String numA, int baseB){
        this.baseA=baseA;
        this.numA=numA;
        this.baseB=baseB;
    }
    
    public String getNumero(){
        return numA;
    }
    public int getBaseA(){
        return baseA;
    }
    public int getBaseB(){
        return baseB;
    }
    public void SetNumero(String numA){
        this.numA=numA;
    }
    public void setBaseA(int baseA){
        this.baseA=baseA;
    }
    public void setBaseB(int baseB){
        this.baseB=baseB;
    }
    public String setAlgoritmoEntero(String numA, int baseB, int baseA){
       this.numA=numA;
       this.baseB=baseB;
       this.baseA=baseA;
       String ba="Holaa";
       String resul=ba;
        return resul;
    }
    public String getAlgotirmoEntero(){
        
        this.numA=numA;
        this.baseB=baseB;
        this.baseA=baseA;
        String ResulBase = Integer.toString(Integer.valueOf(numA,baseA),baseB);
        ResultadoEntero=ResultadoEntero;
        
        return ResultadoEntero;
    }
}


