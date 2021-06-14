// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.original;

public class Arquivo {
    private String conteudo;
    private String dispositivo;
    
    public Arquivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }  
    
    public void imprimir() {
        if (this.dispositivo.equals("Pdf")) {
            Pdf pdf = new Pdf();
            pdf.imprimir(this.conteudo);
        } 
        else {
            if (this.dispositivo.equals("Html")) {
                Html html = new Html();
                html.imprimir(this.conteudo);
            }
        }
    }
    
}
