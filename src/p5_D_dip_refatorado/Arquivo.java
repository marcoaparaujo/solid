// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package p5_D_dip_refatorado;

public class Arquivo {
    private String conteudo;
    private Formato dispositivo;
    
    public Arquivo(Formato dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }  
    
    public void imprimir() {
        this.dispositivo.imprimir(conteudo);
    }
    
}
