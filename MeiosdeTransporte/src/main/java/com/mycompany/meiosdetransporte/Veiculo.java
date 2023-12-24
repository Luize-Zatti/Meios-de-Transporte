package com.mycompany.meiosdetransporte;
import java.util.Scanner;
public class Veiculo {
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade;
    private int m;

    Scanner ler = new Scanner(System.in);
    
    public Veiculo(String marc, int qtdR, String mod, int velo) {
        this.marca = marc;
        this.qtdRodas = qtdR;
        this.modelo = mod;
        this.velocidade = velo = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void imprimirInformaçõesVe(){
        System.out.println("A marca é: " + this.getMarca());  
        System.out.println("A marca é: " + this.getModelo());
        System.out.println("A marca é: " + this.getQtdRodas());
        System.out.println("A marca é: " + this.getVelocidade());
        
    }
    
    public void acelerar(){
        System.out.println("A velociade inicial do veiculo é de " + this.getVelocidade());
        System. out.println("A aceleração desejada é de: ");
            m = ler.nextInt();
        this.setVelocidade(this.getVelocidade()+ m);
        System.out.println("A velocidade alcançada é de: " + this.getVelocidade());
        
        
    }
    public void freiar(){
        if(this.getVelocidade() > 0){
            this.setVelocidade(this.getVelocidade() - 1);
            System.out.println("A velocidade do veículo após freiar é de " + this.getVelocidade() + " Km/h");
        }
        else {
            System.out.println("O veículo está parado. Não é possível freiar.");
        }
    }
}
