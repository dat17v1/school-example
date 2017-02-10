public class Teacher {
  private String firstname;
  private String lastname;
  private String phone;
  private String email;

  // Set - method
  public void setFirstname(String newFirstname) {
    firstname = newFirstname;
  }
  // Set - method
  public void setLastname(String newLastname) {
    lastname = newLastname;
  }
  public void printInfo() {
    System.out.println(firstname);
    System.out.println(lastname);
    System.out.println(phone);
    System.out.println(email);
  }

  // // Constructor
  // public Teacher(String firstname, String lastname, String email, String phone) {
  //   this.firstname = firstname;
  //   this.lastname = lastname;
  //   this.email = email;
  //   this.phone = phone;
  // }
  // public Teacher() {

  // }

  // private attributes
  // setFirstname method definition
  // setLastname method definition
  // printInfo method definition

  // From RunSchoolExample:
  // Call setFirstname, setLastname method with appropriate values
  // Call printInfo method.
  
}