
package exercício.pkg03.aula.pkg4.de.d.appi.lógica.o.o;


public class Cliente {
    public String nome;
    private int idade;
    private double renda;
    
    public int getIdade() {
        return idade;
        }
     public void setIdade(int valor) {
        this.idade = valor;
         }
    
    public double getRenda() {
        return renda;
        }
     public void setRenda(int renda) {
        this.renda = renda;
         }
     
     public String verificarNumero() {
         String resposta;
         
         if (this.idade >= 18) {
             resposta = "VOCÊ É MAIOR DE IDADE!";
         }else {
             resposta = "DESCULE, MAS VOCÊ NAO É MAIOR DE IDADE!";
         }
         {
         
         if (this.renda >= 15000) {
             resposta = "PARABÉNS! VOCÊ É RICO!";
         }else {
             resposta = "SINTO MUITO MAS VOCÊ AINDA NÃO CHEGOU LÀ!";
         }
         return resposta;
         
     }
}
}