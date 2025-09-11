package avaliacao2;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Danielle
 */

//SUBCLASSE NAVIO:
public class Navio extends Transporte{
    private String nome;
    private int numeroTripulantes;
    private String dataLancamento;
   
    
//CONSTRUTOR COM PARAMETRO
    public Navio(String nome, int numeroTripulantes, String dataLancamento, int capacidadeTanque, int numeroPassageiros, float preco){
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
        
    }
 //CONSTRUTOR SEM PARAMETRO

    public Navio() {
    }
    
    //GETTERS E SETTERS:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }
    
 //PASSAGEIROS POR TRIPULANTES
  public double passageirosPorTripulantes() {
    if (numeroTripulantes == 0) return 0; // evita divisão por zero
    return (double) numeroPassageiros / numeroTripulantes;
}
    
//METODO DE ENTRADA:
    public void entrada(Scanner scan){
        try {
            System.out.println("Digite o nome: ");
            nome = scan.nextLine();
            
            System.out.println("Digite a capacidade do tanque: ");
            this.capacidadeTanque = scan.nextInt();
            
            System.out.println("Digite o número de passageiros: ");
            this.numeroPassageiros = scan.nextInt();
            
            System.out.println("Digiteo número dos tripulantes: ");
            numeroTripulantes = scan.nextInt();
            
            System.out.println("Digite o preço: ");
            this.preco = scan.nextInt();
            
            System.out.println("Digite a data de lançamento: ");
            dataLancamento = scan.nextLine();
            
            }catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Use números corretos.");
            scan.nextLine(); // limpar buffer
        }
        
    }
    
    //METODO IMPRIMIR:
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Data de lançamento: "+dataLancamento);
        System.out.println("Número de tripulantes: "+numeroTripulantes);
        System.out.println("Capacidade do tanque: "+capacidadeTanque);
        System.out.println("Número de passageiros: "+numeroPassageiros);
        System.out.println("Preço: "+preco);
        System.out.println("Passageiros por tripulantes: "+ passageirosPorTripulantes());
    }
}
