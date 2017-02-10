public class RunSchoolExample {
  
  public static void main(String[] args) {
      // Create object
      // Classname objectname = new Classname();
      Student student1 = new Student();
      
      // Call method
      // objectname.methodname(parameters);
      student1.setName("Tobias");
      student1.printInfo();




      // Teacher teacher1 = new Teacher("Christian", "Kirschberg", "chrk@kea.dk", "12312312");
      Teacher teacher1 = new Teacher();
      Teacher teacher2 = new Teacher();
      Teacher teacher3 = new Teacher();

      teacher1.setFirstname("Christian");
      teacher1.printInfo();

      // teacher1.firstname = "Claus";
      // teacher1.lastname = "Bové";
      // ...
      
      // teacher2.firstname = "Christian";
      // teacher2.lastname = "Kirschberg";
      
      // teacher3.firstname = "Marianne";
      // teacher3.lastname = "Nielsen";


      // Set an attribute's value
      // If not private
      // objectname.attributeName = value
      
      // student1.name = "Tobias";
      // System.out.println(student1.name);

      // Print teachers
      // System.out.println("Teacher1: " + teacher1.firstname 
      // + " " + teacher1.lastname);

      // System.out.println("Teacher2: " + teacher2.firstname 
      // + " " + teacher2.lastname);

      // System.out.println("Teacher3: " + teacher3.firstname 
      // + " " + teacher3.lastname);
      


  }

}