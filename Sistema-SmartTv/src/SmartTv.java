public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    //Estatus de ligado ou desligado
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    // estatus de aumentar e diminuir volume
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

 // Mudança de canal

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }

}
