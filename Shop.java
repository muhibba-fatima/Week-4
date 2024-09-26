import java.util.Scanner;

public class Shop{
      private Product productList[] = new Product[400];
      private Person owner;
      private String address;
      private static int productCount = 0;

      private static double revenue;

public Shop(Person owner, String address){
      this.owner = owner;
      this.address = address;
      this.productList = new Product[100];
}

 public void addProduct(){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter details of the product");
      System.out.println("Name : ");
      String name = input.nextLine();
      System.out.println("Price : ");
      double price = input.nextDouble();
      System.out.println("Quantity : ");
      int quantity = input.nextInt();

      Product product = new Product(name, price, quantity);
       productList[productCount++]= product;
       System.out.println("Product added successfully");
}

public void sale(){
     System.out.println("Welcome to menu");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter product ID : ");
    String id = sc.nextLine();

  for(int i=0; i<productCount; i++){
      if(productList[i].getId().equals(id)){
        productList[i].setQuantity(productList[i].getQuantity()-1);
        revenue+= productList[i].getPrice();
       System.out.println("Successfully sale");
}
else{
     System.out.println("Not found");
}
}
}
  public void display(){
    if(productCount == 0){
        System.out.println("No products found!");
}
     System.out.println("Product list");
    for(int i=0; i<productCount; i++){
         System.out.println(productList[i].toString());
     }
   }

public void modify(){
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter product to modify : ");
      String id = sc2.nextLine();
     for (int i = 0; i < productCount; i++) {
        if (productList[i].getId().equals(id)) {
            System.out.println("Product found. Enter new details : ");
 
        System.out.println("Enter new name : ");
        String newName = sc2.nextLine();
         if (!newName.trim().isEmpty()) {
                productList[i].setName(newName);
            }

        System.out.println("Enter new price : ");
        String newPrice = sc2.nextLine();
                  System.out.println("Enter new quantity : ");
        String newQuantity = sc2.nextLine();
       
       System.out.println("Product updated successfully");
  }    
}
}
public void removeProduct(){
     Scanner sc1 = new Scanner(System.in);
     System.out.println("Enter product ID to remove : ");
     String id = sc1.nextLine();
    boolean found = false;

        for (int i = 0; i < productCount; i++) {
            if (productList[i].getId().equals(id)) {
                found = true;
             
                for (int j = i; j < productCount - 1; j++) {
                    productList[j] = productList[j + 1];
                }
                productList[--productCount] = null;
                System.out.println("Product removed successfully");
                break;
            }   
}
 if (!found) {
            System.out.println("Product not found");
        }
    }
}
