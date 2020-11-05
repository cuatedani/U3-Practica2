/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER}
 */
public class ColaSimple {
    protected char[] cola=new char[10];
    protected int ini=-1;
    protected int fin=-1;
    protected char ValEl;
    
    public boolean Insertar(char v){
        if(fin==(cola.length-1)){
            return false;//cola llena
        }
        fin++;
        cola[fin]=v;
        if(fin==0 && ini==-1){//cuando se ingresa primer valor y hay desface
            ini++;
        }
        return true;
    }
    
    public boolean Eliminar(){
        if(ini==-1 && fin==-1){
        return false;}
        ValEl=cola[ini];
        if(ini==fin && ini!=-1){
            ini=-1;
            fin=-1;
        }
        ini++;
        return true;
    }

    public char[] getCola() {
        return cola;
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

    public char getValEl() {
        return ValEl;
    }
}
