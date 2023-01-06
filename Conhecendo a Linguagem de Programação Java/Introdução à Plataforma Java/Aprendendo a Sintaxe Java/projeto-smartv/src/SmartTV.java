public class SmartTV {
   
    boolean ligada = false;
    int canal = 2;
    int volume = 10;

    public void ligar() {
        ligada= true;
    }
    public void desligar() {
        ligada = true;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void mudaCanal(int novoCanal){
        canal=novoCanal;
    }
    
    
}
