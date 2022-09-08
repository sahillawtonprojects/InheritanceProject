package heroes;

public class MainClass {
    
    public static void main(String[] args){
        //Creating an object of Superman right here.
        Kryptonian superman = new Kryptonian("239098840231993",100, 200, "Clark Kent");
        //Calling a method from the superclass.
        superman.speak();
        //Calling a method from the subclass.
        superman.fly();
        //Call the XRayVision method that you created here.
        
        //Creating an object of Dr Strange right here
        //Dr Strange has 500 magical energy, a variable specific to the subclass
        Sorcerer sorcererSupreme = new Sorcerer("239098840231993", 80, 150, "Stephen Strange", 500);
        //Here we check the health and energy before the sorcerer heals themself
        sorcererSupreme.printHealth();
        sorcererSupreme.printMagicalEnergy();
        
        sorcererSupreme.healSelf();
        //Here we check the health and energy after the sorcerer heals themself
        sorcererSupreme.printHealth();
        sorcererSupreme.printMagicalEnergy();
        
        //Create an object of Teleporter here, just as we did above
        
    }
}
