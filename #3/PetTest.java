package Assignment5;
public class PetTest {

    public static void main(String[] args) {
        
        Dog myDog = new Dog("Buddy", 3, "Brown", "Golden Retriever");
        myDog.displayInfo();  
        myDog.fetch();  
        
        System.out.println();

        
        Cat myCat = new Cat("Whiskers", 2, "Black", true);
        myCat.displayInfo(); 
        myCat.scratch(); 

        System.out.println();

      
        Kitten myKitten = new Kitten("Fluffy", 1, "Gray", true, true);
        myKitten.displayInfo(); 
        myKitten.scratch();
        myKitten.play(); 
    }
}
