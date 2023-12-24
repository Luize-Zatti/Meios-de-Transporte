package com.mycompany.meiosdetransporte;

public class Automovel extends Veiculo{
 
    private double potenciaDoMotor;

    public Automovel(double pDM, String marc, int qtdR, String mod, int velo) {
        super(marc, qtdR, mod, velo);
        this.potenciaDoMotor = pDM;
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    public void imprimirInformaçõesAuto(){
        System.out.println("A potencia do motor é: " + this.getPotenciaDoMotor());  
    }
}
