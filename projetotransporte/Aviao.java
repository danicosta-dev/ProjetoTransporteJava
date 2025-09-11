package projetotransporte;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Danielle
 */

//subclasse aviao
public class Aviao extends Transporte {
    private String prefixo;
    private String dataRevisao;
    
//construtor com parametro:
    public Aviao(String prefixo, String dataRevisao, int capacidadeTanque, int numeroPassageiros, float preco) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }
//construtor sem parametro
    public Aviao() {
        
    }
   
//GETTERS E SETTERS:

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

 //METODO DE ENTRADA:
    public void entrada(Scanner scan){
        try {
            System.out.println("Digite o prefixo: ");
            this.prefixo = scan.nextLine();
            
            System.out.println("Digite a capacidade do Tanque: ");
            this.capacidadeTanque = scan.nextInt();
            
            System.out.println("Digite o Númedo de Passageiros: ");
            this.numeroPassageiros = scan.nextInt();
            
            System.out.println("Digite o preço: ");
            this.preco = scan.nextFloat();
            
            System.out.println("Digite a data de previsão: ");
            this.dataRevisao = scan.nextLine();
            
             } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Use números corretos.");
            scan.nextLine(); // limpar buffer
 
        }
    }
    
//METODO PERSONALIZADO
    public void reajustarPreco(float percentual){
       this.preco+= this.preco*(percentual/100.0);
    }
    
    //METODO IMPRIMIR:
 public void imprimir(){
    System.out.println("Prfixo: "+prefixo);
    System.out.println("Data de revisão: "+dataRevisao);
    System.out.println("Capacidade do Tanque: "+capacidadeTanque);
    System.out.println("Número de Passageiros"+numeroPassageiros);
    System.out.println("Preco: "+preco);
}
 
 
 
 
 
}
