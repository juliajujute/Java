
package superclasse;

public class Animal {
    
    
    String nome, raca;
    double peso;

    //construtor da classe passando nome
    public Animal(String nome) {
    }
    
    //metodo construtor passando o nome e a raca
     public Animal(String nome, String raca) {
    }
    
     // metodo construtor passando nome, raca e peso
    public Animal(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }
    
    
    
    public void fazerBarulho(){
        System.out.println( "Ruff Ruff Ruff");
    }
    
}
