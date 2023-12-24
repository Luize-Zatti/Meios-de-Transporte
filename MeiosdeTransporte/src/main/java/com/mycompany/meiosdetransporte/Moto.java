package com.mycompany.meiosdetransporte;

public class Moto extends Automovel{
    
    private boolean partidaEletrica;

    public Moto(boolean parE, double pDM, String marc, int qtdR, String mod, int velo) {
        super(pDM, marc, qtdR, mod, velo);
        this.partidaEletrica = parE;
    }

    public boolean getPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    public void imprimirInformaçõesMo(){
        System.out.println("A partida da moto é elétrica: " + this.getPartidaEletrica());  
   }
}
