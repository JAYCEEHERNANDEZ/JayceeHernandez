public class Activity{
public static void main(String[] args){

    Dog aso = new Dog();
    aso.name = "Ed";
    aso.papi = 5;

    aso.dogie[0] = "ja";
    aso.dogie[1] = "je";
    aso.dogie[2] = "ji";
    aso.dogie[3] = "jo";
    aso.dogie[4] = "ju";

    System.out.println(aso.showName());
    System.out.println("woof! woof!");
    System.out.println("Number of Puppies: " + aso.numOfPapi());
    System.out.println("List of Puppies");

    for(int i = 0; i < 5; i++){
        System.out.println(aso.dogie[i]);
    }

}
}