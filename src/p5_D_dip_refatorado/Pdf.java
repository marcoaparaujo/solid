// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package p5_D_dip_refatorado;

public class Pdf implements Formato {

    public void imprimir(String conteudo) {
        System.out.println("PDF: " + conteudo);
    }
}
