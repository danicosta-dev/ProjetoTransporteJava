package  projetotransporte;
/**
 *
 * @author Danielle
 */
public class Transporte {
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected float preco;
    
    //construtor com parametro:

    public Transporte(int capacidadeTanque, int numeroPassageiros, float preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }
//construtor sem parametro:
    public Transporte() {
    }
    
    //GETTERS E SETTERS:
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
        public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
 
    
   
}
