
package superclasse;


public class SuperClasse {

    public static void main(String[] args) {
     Cachorro cachorro = new Cachorro( "billy", "caramelo");
     Galinha galinha = new Galinha("galinha");
     Corvo corvo = new Corvo("corvo");
     
     
     cachorro.fazerBarulho();
     galinha.fazerBarulho();
     corvo.fazerBarulho();

             
    }
    
}
