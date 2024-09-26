import java.util.Scanner;

public class Test{

         public static void main(String args[]){

    Shop shop = new Shop(new Person("Alex", "email"),"Karachi"); 
     Scanner sc = new Scanner(System.in);
       while (true){
        int choice = sc.nextInt();
        switch (choice){
    case 1:
          shop.addProduct();
          break;
   case 2:
          shop.sale();
          break;
   case 3:
          shop.display();
          break;
   case 4:
          shop.removeProduct();
          break;
   case 5:
          shop.modify();
          break;
   case 0:
          System.exit(0);
          break;
   default:
  }

 }
}
}