class SuperObject {
  public void paint() {
    draw();
  }
  public void draw() {
    System.out.println("SuperObject");
  }
}

class subObject extends SuperObject {
  public void paint() {
    super.draw();
  }

  public void draw() {
    System.out.println("subObject");
  }
}

public class Test {
  public static void main(String[] args) {
    SuperObject s = new subObject();
    s.paint();
  }
}

//output
// SuperObject
