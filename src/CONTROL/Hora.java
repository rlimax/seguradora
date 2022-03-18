package CONTROL;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;
    
    private int getHora(){
        return hora;
    }
    private int getMinuto(){
        return minuto;
    }
    private int getSegundo(){
        return segundo;
    }
    
    private void setHora(int h){
        this.hora = h;
    }
    private void setMinuto(int m){
        this.minuto = m;
    }
    private void setSegundo(int s){
        this.segundo = s;
    }
    public String atualizaHora(int s){
        this.segundo = this.getSegundo()+s;
        if(segundo>59){
            this.minuto = getMinuto()+1;
            this.segundo = 0;
        }
        if(minuto>59){
            this.hora = getHora()+1;
            this.minuto = 0;
        }
        //Mantém duas casas para HH:MM:SS mesmo abaixo de 10
        return (this.getHora()<10?"0"+this.getHora():this.getHora())+":"+(this.getMinuto()<10?"0"+this.getMinuto():this.getMinuto())+":"+(this.getSegundo()<10?"0"+this.getSegundo():this.getSegundo());
        
    }
        
        
//    public static void main(String args[]){
//        Hora h = new Hora();
//        int c = 0;
//        while(c<3600){
//            try {
//                h.atualizaHora();
//                c++;
//                sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Hora.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }    
//    }
}
