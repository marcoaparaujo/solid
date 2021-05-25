// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package p2_O_ocp_refatorado;

public class ocp_refatorado {

    public static void main(String args[]) {
        
        Arquivo arquivo = new Arquivo("Html");
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
