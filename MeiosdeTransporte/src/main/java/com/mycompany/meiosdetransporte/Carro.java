package com.mycompany.meiosdetransporte;

public class Carro extends Automovel{
    
    private int qtdPortas;

    public Carro(int qtdP, double pDM, String marc, int qtdR, String mod, int velo) {
        super(pDM, marc, qtdR, mod, velo);
        this.qtdPortas = qtdP;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
    public void imprimirInformaçõesCa(){
        System.out.println("Quantidade de portas: " + this.getQtdPortas());   
    }
    
}
