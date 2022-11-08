

public class Students {

   private int age;
   private String name;

   public  Students(int age, String name) {
       this.age = age;
       this.name = name;


   }

   public int getAge(){
       return age;

   }

   public void setAge(int age)throws MyException {
           if (age <= 0) {
             throw   new MyException();
           } else {
               this.age = age;
           }
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Students{" +
              "age=" + age +
              ", name='" + name + '\'' +
              '}';
   }
}
