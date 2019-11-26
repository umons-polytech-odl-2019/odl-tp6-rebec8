package be.ac.umons;

abstract class AbstractFactory {

 private String name;

    public AbstractFactory ( String name){ this.name = name;}

 public static AbstractFactory getFactory(String name) { // pq abstractfactory? pcq je vais retourner quelque chose de ce type( je retourne factoryhut ou dominohut)
     //System.out.println("Factoryhut ou Factorydominos?");
     // Scanner lectureclavier = new Scanner(System.in);
     //name = lectureclavier nextString();

     if (name == "hut") {

         return new Factoryhut();
     }
     if (name == "Dominos") {

         return new Factorydominos();
     }
 }

    public abstract Pizza createpizza(String name);

}
