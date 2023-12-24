package com.mycompany.meiosdetransporte;
    import java.util.Scanner;
public class MeiosdeTransporte{
    public static void main(String[] args) {
        
        Bicicleta b1 = new Bicicleta(27, false, "KRW", 2, "Aro 29, Freio Hidráulico com Trava S31 - Grafite+Preto. ", 40);
        Bicicleta b2 = new Bicicleta(21, false, "Shimano", 2, "Aro 29, MTB Pontal Blitz Alumínio - Cinza", 40);
        Bicicleta b3 = new Bicicleta(24, false, "Aluinum", 2, "Aro 29, Aluminum Raider Index Freio a Disco - Azul+Preto", 40);
        Bicicleta b4 = new Bicicleta(0, true, "Ultra Bikes", 2, "Aro 26, Strong Freios V-Brake - Branco", 40);
        Bicicleta b5 = new Bicicleta(6, true, "Ultra Bikes", 2, "Aro 26, Summer Bicolor - Preto+Branco", 40);
        
        Moto m1 = new Moto(true, 13.500,"Honda", 2, "CBR 600RR, injeção eletrônica, 6 velocidades - Preta.", 286);
        Moto m2 = new Moto(true, 14.000, "Kawasaki", 2, "NINJA ZX-6R, Injeção eletrônica, 6 velocidades - VERDE KRT",275);
        Moto m3 = new Moto(true, 8.000, "Shineray", 2, "JET 50 cc, 85 Kg, 4 velocidades - Vermelha", 70);
        Moto m4 = new Moto(true, 6.000, "Yamaha", 2, "XT 660 R, Injeção eletrônica, 4 velocidades - Azul", 180);             
        Moto m5 = new Moto(true,6.500, "BMW", 2, "G 650 GS, injeção eletronica, 5 velocidades - Preto + Vermelho", 168);
                              
        Carro c1 = new Carro(3, 6.000, "Hyundai", 4, "Veloster Salão de Detroit 2011, câmbio automatico - Amarelo", 195);
        Carro c2 = new Carro(2, 4.600, "Volkswagen", 4, "Fusca 1982, câmbio manual - Azul", 144);
        Carro c3 = new Carro(4, 5.200, "Chevrolet", 4, "Astra Sedan Comfort 2.0 (Flex) 2004, câmbio manual - Grafite + Preto", 203 );
        Carro c4 = new Carro(4, 6.300, "Honda", 4, "Civic 2022, câmbio manual - Cinza", 238);
        Carro c5 = new Carro(4, 5.750, "Volkswagen", 4, "Gol copa 1.6 2006, câmbio manual - Vermelho", 184);        
        
        int n;
        int m = 1;
        while(m==1){
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Olá seja bem vindo(a), possuimos diferentes tipos de veiculos, para que possamos atender melhor as suas necessidades, precisamos de algumas informações!");
        System.out.println("\nSe prefere bicicletas digite 1, se prefere automoveis digite 2!");
        n = ler.nextInt();
        if (n==1) {
            System.out.println(" No momento possuimos 5 opções de bicicletas: ");
            System.out.println("    1    - Bicicleta KRW, Aro 29, Freio Hidráulico com Trava S31 - Grafite+Preto.");
            System.out.println("    2    - Bicicleta Shimano, Aro 29, MTB Pontal Blitz Alumínio - Cinza.");
            System.out.println("    3    - Bicicleta Aluinum, Aro 29, Aluminum Raider Index Freio a Disco - Azul+Preto.");   
            System.out.println("    4    - Bicicleta Ultra Bikes, Aro 26, Strong Freios V-Brake - Branco.");
            System.out.println("    5    - Bicicleta Ultra Bikes, Aro 26, Summer Bicolor - Preto+Branco.");
            System.out.println("Digite o número da opção escolhida: ");
            
            n = ler.nextInt(); 
            if (n ==1) {
                System.out.println("A bicicleta selecionada foi: " + n);
                b1.imprimirInformaçõesBi();
                System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                n = ler.nextInt();
                        if (n==1){ 
                            b1.acelerar();
                        } 
                        else if (n==2){
                            b1.freiar();
                        }
                        else if (n==3){
                        } 
                        else{
                            System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
            }
            
            else if (n==2){
                System.out.println("A bicicleta selecionada foi: " + n);
                b2.imprimirInformaçõesBi();  
                System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                n = ler.nextInt();
                        if (n==1){ 
                            b1.acelerar();
                        }
                        else if (n==2){
                            b1.freiar();
                        }
                        else if (n==3){
                        } 
                        else{
                            System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
            }
            
            else if (n==3){
                System.out.println("A bicicleta selecionada foi: " + n);
                b3.imprimirInformaçõesBi(); 
                System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                n = ler.nextInt();
                        if (n==1){ 
                            b1.acelerar();
                            }
                        else if (n==2){
                            b1.freiar();
                        }
                        else if (n==3){
                        }
                        else{
                            System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
            }
            
            else if (n==4){
                System.out.println("A bicicleta selecionada foi: " + n);
                b4.imprimirInformaçõesBi();
                System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                n = ler.nextInt();
                        if (n==1){ 
                            b1.acelerar();
                        }
                        else if (n==2){
                            b1.freiar();
                        }
                        else if (n==3){
                        }
                        else{
                            System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                        
            }
            
            else if (n==5){
                System.out.println("A bicicleta selecionada foi: " + n);
                b5.imprimirInformaçõesBi();  
                System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                n = ler.nextInt();
                        if (n==1){ 
                            b1.acelerar();
                        }
                        else if (n==2){
                            b1.freiar();
                        }
                        else if (n==3){
                        }
                        else{
                            System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
            }
            
            else{
                System.out.println("Escolha uma das opções validas");
            }
        }
        
        else if (n==2){
            System.out.println("Você prefere carros digite 1 se preferir motos digite 2: ");
            n = ler.nextInt();
                if (n==1){
                    System.out.println("No momento possuimos 5 opções de carro: ");
                    System.out.println("    1   - Hyunday, Veloster Salão de Detroit 2011, câmbio automatico - Amarelo");
                    System.out.println("    2   - Volkswagem, Fusca 1982, câmbio manual - Azul");
                    System.out.println("    3   - Chevrolet, Astra Sedan Comfort 2.0 (Flex) 2004, câmbio manual - Grafite + Preto");
                    System.out.println("    4   - Honda, Civic 2022, câmbio manual - Cinza");
                    System.out.println("    5   - Volkswagem, Gol copa 1.6 2006, câmbio manual - Vermelho");
                    System.out.println("Digite o número da opção escolhida");
                    
                    n = ler.nextInt();
                    if (n==1){
                        System.out.println("o carro selecionado foi: " + n);
                        c1.imprimirInformaçõesCa();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else if(n==2){
                        System.out.println("o carro selecionado foi: " + n);
                        c2.imprimirInformaçõesCa();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else if(n==3){
                        System.out.println("o carro selecionado foi: " + n);
                        c3.imprimirInformaçõesCa();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else if(n==4){
                        System.out.println("o carro selecionado foi: " + n);
                        c4.imprimirInformaçõesCa();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else if(n==5){
                        System.out.println("o carro selecionado foi: " + n);
                        c5.imprimirInformaçõesCa();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else{
                        System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                    }               
                }
                else if (n==2){
                    System.out.println("No momento possuimos 5 opções de moto: ");
                    System.out.println("    1   - Honda,CBR 600RR, injeção eletrônica, 6 velocidades - Preta.");
                    System.out.println("    2   - Kawasaki, NINJA ZX-6R, Injeção eletrônica, 6 velocidades - VERDE KRT.");
                    System.out.println("    3   - Shineray, JET 50 cc, 85 Kg, 4 velocidades - Vermelha");
                    System.out.println("    4   - Yamaha, XT 660 R, Injeção eletrônica, 4 velocidades - Azul");
                    System.out.println("    5   - BMW, G 650 GS, injeção eletronica, 5 velocidades - Preto + Vermelho");
                    System.out.println("Digite o número da opção escolhida");
                    
                    n = ler.nextInt();
                    if (n==1){
                        System.out.println("A moto selecionada foi: " + n);
                        m1.imprimirInformaçõesMo();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else if (n==2){
                        System.out.println("A moto selecionada foi: " + n);
                        m2.imprimirInformaçõesMo();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else if (n==3){
                        System.out.println("A moto selecionada foi: " + n);
                        m3.imprimirInformaçõesMo();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else if (n==4){
                        System.out.println("A moto selecionada foi: " + n);
                        m4.imprimirInformaçõesMo();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else if (n==5){
                        System.out.println("A moto selecionada foi: " + n);
                        m5.imprimirInformaçõesMo();
                        System.out.println("Se deseja testar a aceleração digite 1, se deseja testar a frenage digite 2, se não deseja fazer nenhum teste digite 3.");
                        n = ler.nextInt();
                            if (n==1){ 
                                b1.acelerar();
                            } 
                            else if (n==2){
                                b1.freiar();
                            }
                            else if (n==3){
                            } 
                            else{
                                System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                        }
                    }
                    
                    else {
                        System.out.println("Opção invalida, escolha uma das opções disponiveis. ");
                    }
            }
        }
        else {
            System.out.println("Escolha uma das opções validas");
        }
        System.out.println("Deseja recomeçar? S ou N ");
        System.out.println("Se sim digite 1 se não digite 2 ");
        m = ler.nextInt();
        }    
        System.out.println("Parabéns pela sua nova aquisição! ");
    
}
}