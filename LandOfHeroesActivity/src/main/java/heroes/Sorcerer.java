package heroes;

public class Sorcerer extends Hero{
    int magicalEnergy;
    
    public Sorcerer(String heroSocialSecurityNumber, int health, int energy, String name, int magicalEnergy){
        super(heroSocialSecurityNumber, health, energy, name);
        this.magicalEnergy = magicalEnergy;
    }
    
    public void castAttackingSpell(){
    //The code to cast an attacking spell would usually go here
    //We will just print the action for now
    System.out.println(name + " is using an attacking spell");
    }
    
    public void castDefensiveSpell(){
    System.out.println(name + " is using a defensive spell");
    }
    
    public void healSelf(){
        //Right here, a sorceror uses some of their magical energy to increase their health
        if(this.magicalEnergy >= 5){
            health = health + 20;
            this.magicalEnergy = this.magicalEnergy - 5;
            System.out.println(name + " has increased their health by 20 points");
        }
        else{
            System.out.println(name + " does not have enough magical energy to heal themselves");
        }
    }
    
    //We see an example of dynamic binding here.
    //For more information about dynamic binding, please watch my playlist on abstract classes<3
    public void healAnother(Hero hero){
          if(this.magicalEnergy >= 5){
            hero.health = hero.health + 20;
            this.magicalEnergy = this.magicalEnergy - 5;
            System.out.println(name + " has increased the other character's health by 20 points");
        }
        else{
            System.out.println(name + " does not have enough magical energy to heal the other character");
        }
    }
    
    public void printMagicalEnergy(){
        System.out.println(name+" has "+ this.magicalEnergy + " magical energy left.");
    }
}
