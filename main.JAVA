
public class Pet {
private String name;
private int age;
private double weight;

// default constructor
   public Pet() {
   name = "";
   age = 0;
   weight = 0;
   }

   // accessors, and mutators
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }
  
   public double getWeight() {
       return weight;
   }

   public void setWeight(double weight) {
       this.weight = weight;
   }

   // method for lifespan
   public String getLifespan(){
       return "unknown lifespan";
   }
}

__________________________________________________


public class Dog extends Pet{
   private String breed;

   // default constructor
   public Dog() {
       breed = "";
   }

   //    // accessor and mutator
   public String getBreed() {
       return breed;
   }

   public void setBreed(String breed) {
       this.breed = breed;
   }
  
   // method for lifespan
   public String getLifespan(){
       if (this.getWeight()>100)
       return "approximately 7 years";
       else
       return "approximately 13 years";
   }
  
}

_____________________________________________________________


public class Rock extends Pet{
   // method for lifespan
   public String getLifespan(){
       return "thousands of years";
   }
  
}

__________________________________


public class PetDemo {
   public static void main(String[] args) {
      
       // CREATING INSTANCES
  
       // Pet object
       Pet pet = new Pet();
       pet.setName("Boo");
       pet.setAge(2);
       pet.setWeight(50);
       System.out.println("Pet [Name: "+pet.getName()+ ", Age: "+pet.getAge()+" years, Weight: "+pet.getWeight()+" pounds, Lifespan: "+pet.getLifespan()+"]");
      
       //Dog object
       Dog dog = new Dog();
       dog.setName("Hach");
       dog.setAge(10);
       dog.setWeight(120);
       dog.setBreed("Hachiko");
       System.out.println("Dog [Name: "+dog.getName()+ ", Age: "+dog.getAge()+" years, Weight: "+dog.getWeight()+" pounds, Breed: "+dog.getBreed()+", Lifespan: "+dog.getLifespan()+"]");
      
      
       // Dog object
       Rock rock = new Rock();
       rock.setName("Hardd");
       rock.setAge(1000);
       rock.setWeight(20000);
       System.out.println("Rock [Name: "+rock.getName()+ ", Age: "+rock.getAge()+" years, Weight: "+rock.getWeight()+" pounds, Lifespan: "+rock.getLifespan()+"]");
      
  
   }

}
