package com.mycompany.meiosdetransporte;

public class Bicicleta extends Veiculo{
    
    private int numMarchas;
    private boolean bagageiro;

  
    public Bicicleta(int numM, boolean bag, String marc, int qtdR, String mod, int velo) {
        super(marc, qtdR, mod, velo);
        this.numMarchas = numM;
        this.bagageiro = bag;
    }
    
    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean getBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

     public void imprimirInformaçõesBi(){
        System.out.println("Quantidade de marchas: " + this.getNumMarchas());
        System.out.println("Possui bagageiro: " + this.getBagageiro());
    }
    
} 
    
    
   