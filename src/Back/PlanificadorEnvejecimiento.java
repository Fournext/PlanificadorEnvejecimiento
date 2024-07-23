/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Back;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue; 
/**
 *
 * @author sebas
 */
public class PlanificadorEnvejecimiento {
    Queue<PCB> cola;
    List<Queue<PCB>> listaColas;
    PCB PRUN;
    int k;
    private boolean PRUNCargado = false; 
    
    public PlanificadorEnvejecimiento(){
        cola = new LinkedList<>();
        listaColas = new LinkedList<>();
        PRUN=new PCB();
        k=0;
    }
    
    public PlanificadorEnvejecimiento Copia(){
        PlanificadorEnvejecimiento n = new PlanificadorEnvejecimiento();
        //n.addColas(this.getCantColas());
        //Queue<PCB> cola2 = new LinkedList<>();
        for (int i = 0; i < this.getCantColas(); i++) {
            cola = listaColas.get(i);
            Queue<PCB> cola2 = new LinkedList<>();
            for(PCB PRUNG:cola){
                PCB PRUNNew = new PCB();
                PRUNNew.ImageName = PRUNG.ImageName;
                PRUNNew.PID = PRUNG.PID;
                PRUNNew.Register = PRUNG.Register;
                PRUNNew.cl = PRUNG.cl;
                PRUNNew.fn = PRUNG.fn;
                PRUNNew.prioridad = PRUNG.prioridad;
                cola2.add(PRUNNew);
            }
            n.listaColas.add(cola2);
        }
        return n;
    }
    
    public void predeterminado(){
        this.addColas(3);
        this.LlenarColas(3,3);
    }
    
    public void addColas(int cant){
        for (int i = 0; i < cant; i++) {
            listaColas.add(new LinkedList<>());
        }
    }
    
    public int getCantColas(){
        return listaColas.size();
    }
    
    public int getCantPRUN(){
        return listaColas.get(k).size();
    }
    
    public int getCantPRUN(int i){
        return this.listaColas.get(i-1).size();
    }
    
    public int getK(){
        return k;
    }

    
    public void LlenarColas(int cantColas,int cantProcesos){
        String[] abc={"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < cantColas; i++) {
            //System.out.println(i);
            addProcesosCola(i, cantProcesos, abc[i]);
        }
    }
    
    public void LlenarColaIndiv(int indice, int cantProcesos){
        String[] abc={"A","B","C","D","E","F","G","H","I","J"};
        addProcesosCola(indice, cantProcesos, abc[indice]);
    }
    
    public void addProcesosCola(int indice, int p, String nomPRUN){
        if(indice >= 0 && indice < listaColas.size()){
            cola = listaColas.get(indice);
            for (int i = 1; i <= p; i++) {
                PCB PRUN = new PCB();
                PRUN.ImageName = nomPRUN + i;
                PRUN.prioridad=indice;
                PRUN.cl=true;
                cola.add(PRUN);
            }
        }
    }
    
    public PCB sacarPRUN(int Indcola, int Indprc){
        PCB pr=new PCB();
        Queue<PCB> cola2 = listaColas.get(Indcola-1);
        PCB PRUN2 = new PCB();
        int lim= cola2.size();
        if(Indprc==1){
            PRUN2=cola2.poll();
            if(PRUN2.cl){
                return PRUN2;    
            }else{
                MeterProceso(Indcola, Indprc, PRUN2);
                return null;
            }
            
        }
        for (int i = 0; i < lim; i++) {
            PRUN2=cola2.poll();
            if(i==Indprc-1){
                pr=PRUN2;
                if(!pr.cl){
                    MeterProceso(Indcola, Indprc, pr);
                    return null;
                }
            }else{
                cola2.add(PRUN2);
            }   
        }
        return pr;
    }
    
    
    private void ModificarClones(PCB ORG){
        for (int i = 0; i < getCantColas()-1; i++) {
            Queue<PCB> cola2 = listaColas.get(i);
            for(PCB PRUN2:cola2){
                if(PRUN2.ImageName.equals(ORG.ImageName+"*")){
                    PRUN2.fn=ORG.fn;
                }
            } 
        }
    }
    
    private void ModificarOriginal(PCB CLON){
        for (int i = 0; i < getCantColas()-1; i++) {
            Queue<PCB> cola2 = listaColas.get(i);
            for(PCB PRUN2:cola2){
                if(CLON.ImageName.equals(PRUN2.ImageName+"*")){
                    PRUN2.fn=CLON.fn;
                }
            } 
        }
    }
    
    public void MeterProceso(int IndCola,int IndPrc,PCB NewPRUN){
        PCB PRUN2 = new PCB();
        Queue<PCB> cola2 = listaColas.get(IndCola-1);
        int lim=cola2.size();
        if(IndPrc==1){
            cola2.add(NewPRUN);
            for (int i = 0; i < lim; i++) {
                PRUN2=cola2.poll();
                cola2.add(PRUN2);
            }
        }else{
            for (int i = 0; i < lim; i++) {
                PRUN2=cola2.poll();
                cola2.add(PRUN2);
                if(i==IndPrc-2){
                    cola2.add(NewPRUN);
                }
            }
        }
        ModificarClones(NewPRUN);
    }
    
    /*
    public void ModificarFinPRUN(PCB PRUN2,int f){
        PRUN2.fn=f;
    }
    */
    
    public String MostrarPocesoCola(int indice){
        String s="";
        if(indice>=0 && indice<listaColas.size()){
            Queue<PCB> cola2 = listaColas.get(indice);
            //System.out.println(cola2);
            for(PCB PRUN:cola2){
                if(PRUN.ImageName!=null && PRUN.ImageName!=null+"*"){
                    s=s+PRUN.ImageName+" ";
                }
                
            }   
        }
        return s;
    }
    
    private int nexcola(int k){
        if(k==getCantColas()-1){
            return 0;
        }
        return k+1;
    }
    
    public String getPRUN(){
        PRUN=listaColas.get(k).poll();
        //PRUN.fn--;
        PRUNCargado=true;
        return PRUN.ImageName;
    }
    
    public String getFN(){
        PRUN=listaColas.get(k).element();
        if(PRUN.fn<0){
            return String.valueOf("∞");
        }else{
            return String.valueOf( PRUN.fn);
        }
        
    }
    
    public boolean existePRUN(String p,int indice){
        Queue<PCB> cola2 = listaColas.get(indice);
            for(PCB PRUN:cola2){
                if(PRUN.ImageName.equals(p)){
                    return true;
                }
                
            }
        return false;
    }
    
    private void FreeMem(){
        for (int i = 0; i < getCantColas(); i++) {
            cola = listaColas.get(i);
            Queue<PCB> elim = new LinkedList<>();
            for(PCB PRUN2:cola){
                if(PRUN2.ImageName.equals(PRUN.ImageName) || PRUN2.ImageName.equals(PRUN.ImageName+"*")||
                   PRUN.ImageName.equals(PRUN2.ImageName+"*")){
                    elim.add(PRUN2);
                    //cola.remove(PRUN2);
                }
            }
            cola.removeAll(elim);
        }
    }
    
    public void CargarG(){
        if(!existePRUN("G", 0)){
            cola= listaColas.get(0);
            PCB PRUNG = new PCB();
            PRUNG.ImageName="G";
            cola.add(PRUNG);
        }
        
    }
    
    public void darQuantum(){
        int i=PRUN.prioridad;
        //verificar si el proceso finalizo
        if(!PRUNCargado){
            k=nexcola(k);
            return;
        }
        if(PRUN.fn==0){
            FreeMem();
        }else{
            PRUN.fn--;
            // verificar si es original
            if(PRUN.cl && !(PRUN.ImageName.equals("G"))){
                ModificarClones(PRUN);
                //verificar si el original no esta en la cola 
                if(PRUN.ImageName != null && !existePRUN(PRUN.ImageName, i )){
                    cola=listaColas.get(i);
                    cola.add(PRUN);
                    //verificar si hay siguiente cola
                    if(i+1<=listaColas.size()-1){
                        cola=listaColas.get(i+1);
                        //crea un nuevo clon y lo manda a la siguiente cola
                        PCB PRUN2=new PCB();
                        PRUN2.ImageName=PRUN.ImageName+"*";
                        PRUN2.prioridad=i;
                        PRUN2.cl=false;
                        PRUN2.fn=PRUN.fn;
                        //verificar si no existe ese clon en la cola 
                        if(!existePRUN(PRUN2.ImageName, i+1)){
                            cola.add(PRUN2);
                            listaColas.set(i+1, cola);
                        }
                    }
                }  
            }else{
                ModificarOriginal(PRUN);
                //verificar si el clon a bajo no esta en la siguiente cola
                if((k+1<=listaColas.size()-1) && !existePRUN(PRUN.ImageName, k+1)){
                    cola=listaColas.get(k+1);
                    //PRUN.prioridad=i+1;
                    cola.add(PRUN);
                }
            }

        }
        k=nexcola(k);
        PRUNCargado=false;
    }
    
    public static void main(String[] args) {
        PlanificadorEnvejecimiento A=new PlanificadorEnvejecimiento(); 
        PlanificadorEnvejecimiento B=new PlanificadorEnvejecimiento(); 
        A.predeterminado();
        B.predeterminado();
        System.out.println(A.MostrarPocesoCola(0));
        B=A.Copia();
        System.out.println(A.MostrarPocesoCola(0));
        A.sacarPRUN(1, 1);
        System.out.println(A.MostrarPocesoCola(0));
        System.out.println(B.MostrarPocesoCola(0));
        System.out.println(B.MostrarPocesoCola(0));
    }
    
}
