/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER}
 */
public class ColaCorrimiento extends ColaSimple{
    
    public boolean Insertar(char v){
        if(fin==(cola.length-1)){
            if(ini>0){//RECORRE Y LUEGO MANDA INSERTAR
                int r=0;
                for(int e=ini; e<=fin; e++){
                    cola[r]=cola[e];
                    r++;                    
                }
                ini=0;//se asignan valores correspondientes
                fin=r-1;
                return Insertar(v);
            }
            return false;//Cola COMPLETAMENTE LLENA         
        }
        //un insertado normal
        fin++;
        cola[fin]=v;
        if(fin==0 && ini==-1){
            ini++;
        }
        return true;
    }
    
}
