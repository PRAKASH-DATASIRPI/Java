class Company {
  String name;


  public Company() {
    name = "datasirpi";
  }
}

public class noargpub {
  public static void main(String[] args) {

    
    Company obj = new Company();
    System.out.println("Company name = " + obj.name);
  }
}