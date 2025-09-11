package projetotransporte;

public class ProjetoTransporte {
    public static void main(String[] args) {
        
        // vetor único com 20 posições (10 aviões + 10 navios)
        Transporte[] transportes = new Transporte[20];
        
        // primeiros 10: Aviões
        for (int i = 0; i < 10; i++) {
            transportes[i] = new Aviao(); // construtor vazio
        }
        
        // próximos 10: Navios
        for (int i = 10; i < 20; i++) {
            transportes[i] = new Navio(); // construtor vazio
        }
        
        // Exibir os objetos criados
        for (int i = 0; i < transportes.length; i++) {
            System.out.println("=== Objeto na posição " + i + " ===");
            
            // Como cada objeto é Aviao ou Navio, o método imprimir() será chamado do tipo correto
            if (transportes[i] instanceof Aviao) {
                ((Aviao) transportes[i]).imprimir();
            } else if (transportes[i] instanceof Navio) {
                ((Navio) transportes[i]).imprimir();
            }
            
            System.out.println(); // linha em branco para separar
        }
    }
}