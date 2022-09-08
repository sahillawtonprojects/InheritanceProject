package heroes;

public class Hero {
    private String heroSocialSecurityNumber;
    int health;
    int energy;
    String name;

    //This is the constructor. We will get to this soon
    public Hero(String heroSocialSecurityNumber, int health, int energy, String name){
        this.heroSocialSecurityNumber = heroSocialSecurityNumber;
        this.health = health;
        this.energy = energy;
        this.name = name;
    }
    
    public void walk(){
        //The code to make a hero walk will go here.
        //For our purposes, we will just print out the action of the hero
        System.out.println(name + " is walking.");
    }
    
    public void speak(){
        System.out.println(name + " is speaking.");
    }
    
    public void block(){
        //Every time a hero blocks, they take very little damage, but they do take some damage.
        this.health = this.health-1;
        System.out.println(name + " has blocked.");
    }
    
    public void swim(){
        System.out.println(name + " is swimming.");
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void meleeAttack() {
        System.out.println(name + " is performing a melee attack.");
    }
    
    
    //this method will be used later to explain the super keyword
    public void warnLowHealth(){
        System.out.println("Warning! Your health is low!");
    }
    
    public void printHealth(){
        System.out.println(name + " has "+ health + " health points left");
    }
    
    public String getYearOfHeroBirth(){
        //Code the method to get the year of a hero's birth, by taking the last 4 characters
        //in their private social security number
        //The social security number is private, so one cannot access it from outside this class
        
        
        //Change this to return the year of birth
        return "";
    }
    
    public int getHeroAge(){
        //Code this to use the getYearOfHeroBirth method to get the hero's age
        
        //change this to return the hero's age
        return 0;
    }
}
