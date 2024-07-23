/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

/**
 *
 * @author sebas
 */
public class PCB {
    
    public int PID;
    public String ImageName;
    public int Register[];
    public int prioridad;
    public boolean cl=true;
    public int fn=-1;
    
    public String getFN(){
        if(fn>=0){
            return String.valueOf(fn);
        }else{
            return "∞";
        }
    }
}
