// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package p2_O_ocp_original;

public class ocp_original {

    public static void main(String args[]) {
        
        Arquivo arquivo = new Arquivo ("Pdf");
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
