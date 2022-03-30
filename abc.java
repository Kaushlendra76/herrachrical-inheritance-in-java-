
import java.util.*;
class radius {
     int r;
     int pi = 3;
     public void input()
     {
         Scanner in=new Scanner(System.in);
         System.out.println("enter radius");
        r=in.nextInt();
     }
    }
  class circle extends radius{
      public void area()
      {
          int area;
          area=pi*r*r;
          System.out.println("area of aircle"+area);
      }
  }
      class cone extends radius{
          public void volume()
          {
          int h;
          float volume;
          Scanner in=new Scanner(System.in);
          System.out.println("enter the height of cone");
        h=in.nextInt();
        volume=(pi*r*r*h)/3;
    System.out.println("volume of cone"+volume);
      }
      }
      class Main
      {
          public static void main(String[] args)
          {
              circle obj=new circle();
              obj.input();
              obj.area();
              cone obj1 =new cone();
              obj1.input();
              obj1.volume();
      }
  }

