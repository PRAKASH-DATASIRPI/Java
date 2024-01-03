abstract class Motor {
  abstract void brake();
}

class SportsBike extends Motor{
    
  
  public void brake() {
    System.out.println("SportsBike Brake");
  }
}

class Mountain extends Motor {
    

  public void brake() {
    System.out.println("MountainBike Brake");
  }
}

class absimp {
  public static void main(String[] args) {
    Mountain m1 = new Mountain();
    m1.brake();
    SportsBike s1 = new SportsBike();
    s1.brake();
  }
}





