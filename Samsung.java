/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Markpos;

/**
 *
 * @author sfabj
 */
public class Samsung extends BrandAbstract {
    
    private String latestPhone;
    private int NETworth;
    private String HQ;
    public Samsung(int id, String name, int year, String ceo, String latest, int net, String hq){
        super(id, name,year,ceo);
        this.latestPhone = latest;
        this.HQ = hq;
        this.NETworth= net;
    }
    
    @Override
     public void newCEO(String ceo){
         super.setCEO(ceo);
     };
    
}
