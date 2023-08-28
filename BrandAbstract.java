/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Markpos;

/**
 *
 * @author sfabj
 */
public abstract class BrandAbstract {
    private int ID;
    private String Name;
    private int YearOfFounding;
    private String CEO; 
    
    public BrandAbstract( int id, String name, int year, String ceo){
        this.ID = id;
        this.Name = name;
        this.YearOfFounding=year;
        this.CEO=ceo;
        
    }
    
    public abstract void newCEO(String ceo);

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }
    
    
}
