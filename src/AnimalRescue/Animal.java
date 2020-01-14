package AnimalRescue;

public class Animal {

    public static void main(String[] args) {
        
        Dog Ricky = new Dog();
        Ricky.name = "Ricky";

        System.out.println(Ricky.name);

        float age= 2.9f;
        Ricky.levelofhealt = "9";
        Ricky.hungerleve = "6";
        Ricky.levelofmode= "10";
        Ricky.favoritefood = "royalcaninmaxi";
        Ricky.recreationactivity="swimming";


        System.out.println(Ricky.levelofhealt);
    }
    

}
