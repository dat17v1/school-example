public class Student {
  // scope type name
  private String name;
  private String phone; // 12345678 - +46 32718219
  private int id;
  private String cpr;
  private String email;

  // Method definition - Must be in a class
  // scope returnType name(parameters)
  // parameters: type name, type name
  public void setName(String newName) {
    // Set attribute value from parameter
    name = newName;
  }
  public void printInfo() {
    System.out.println(name);
  }

}



