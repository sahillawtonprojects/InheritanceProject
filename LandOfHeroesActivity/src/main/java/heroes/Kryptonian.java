package heroes;

//This class already extends the Hero class. It also takes care of the 
//non default constructor in the super class
public class Kryptonian extends Hero {
    
    public Kryptonian(String heroSocialSecurityNumber, int health, int energy, String name){
        super(heroSocialSecurityNumber, health, energy, name);
    }
    
    
    //Create a method here that uses the super classes
    //warn low health method
    //The method should be called "warnLowHealth"
    //It should use the super classes warn low health method for the first part
    //it should print out "Please fly near the sun" afterwards.
    //This method should override the superclasses method.
      
    
    public void fly(){
        //Here would normally go the code to make a kryptonian fly in the game
        //For now, we will just print the action
        //As we can see, the "name" variable is being inherited from the superclass.
        System.out.println(name +" is flying");                
    }
    
    public void shootLazerBeams(){
        System.out.println(name + " is shooting lazer beams.");
    }
    
    //Code the xRayVisionMethod here. 
    //The method should print "hero name" is using X-Ray Vision    
}
