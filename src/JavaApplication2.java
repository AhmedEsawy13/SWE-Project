/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
package javaapplication2;

/**
 *
 * @author amr
 */
 
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.io.IOException;
 import java.util.Scanner;
import javaapplication2.Adminstrator;
import javaapplication2.Products;
import javaapplication2.StoreOwner;
import javaapplication2.UserAccount;

public class JavaApplication2 {
    //static String mainPath = System.getProperty("user.dir");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     Scanner input = new Scanner (System.in); 
        Adminstrator A=new Adminstrator("amr","infui");
       UserAccount U = new UserAccount("mokhtar","hamza");
       StoreOwner S=new StoreOwner("hamza","giza","2556","mokhtar","clothes");
      
       String username = null;
      String password=null;
         
      System.out.println("Welcome to our store");
 System.out.println(" if you have an account whrite (1) to login  "+" if not whrite (2) to rejest ");
        int enter_way= input.nextInt();
      if(enter_way==1){
           System.out.println("Please allow choose your login:" 
     +"\n" + " (1) as  user "  + "\n"+ "(2) as  Adminstrator" +"\n" + "(3 as StoreOwner" );
       System.out.println("enter your choose:");
        int login_type= input.nextInt();
    

      
        switch(login_type){
            
             case 1:
                  boolean in = false;
                 do{
                 System.out.println("\nEnter your username and password to login to your account.");
                 System.out.println("Username: ");
                 username = input.nextLine();
                    password = input.nextLine();
                System.out.println("Password: ");
                password = input.nextLine();
       
        if(U.login(username, password)==true){ 
        System.out.println(" you are login Succesfuly");
        in=true;
        }else{
        System.out.println("your username or password are not correct");
        } } while(in=false);
        
        break;
             case 2:
                 System.out.println("\nEnter your username and password to login to your account.");
                 System.out.println("Username: ");
                 username = input.nextLine();
                    password = input.nextLine();
                System.out.println("Password: ");
                password = input.nextLine();
                 if(A.login(username, password)==true){
                     System.out.println("welcome admin");
                     in=true;
                 }else{ 
                     System.out.println("please try again");
                 }
                 break;
             
             case 3:
                  System.out.println("\nEnter your username and password to login to your account.");
                 System.out.println("Username: ");
                 username = input.nextLine();
                    password = input.nextLine();
                System.out.println("Password: ");
                password = input.nextLine();
                 if(S.login(username, password)==true){
                     System.out.println("welcome store owner");
                     in=true;
                 }else{ 
                     System.out.println("faild login");
                 }
           break;
         }
      } 
      else{
          
      System.out.println("Please allow choose your rejeste :" 
     +"\n" + " (1) as  user "  + "\n"+ "(2) as  Adminstrator" +"\n" + "(3 as StoreOwner" );
       System.out.println("enter your choose:");
        int rejest_type= input.nextInt();
    
        switch(rejest_type){
             case 1:
                 System.out.println("to rejest our website blease whrite next form:");
                 System.out.println("Username: ");
                 username = input.nextLine();
                    password = input.nextLine();
                System.out.println("Password: ");
                password = input.nextLine();
       
        if(U.Register(username, password)==true){ 
        System.out.println(" you are rejest as user Succesfuly");
        }else{
        System.out.println(" not correct plese try again");
        
        }
        break;
             case 2:
              System.out.println("to rejest our website blease whrite next form:");
                 System.out.println("admin name: ");
                 username = input.nextLine();
                    password = input.nextLine();
                System.out.println("Password: ");
                password = input.nextLine();
       
        if(A.Register(username, password)==true){ 
        System.out.println(" you are rejest to admin  Succesfuly");
        }else{
        System.out.println(" invalid admin name or pass plese try again");
        }
                 break;
             
             case 3:
                 System.out.println("to rejest our website blease whrite next form:");
                 System.out.println("storeowner name : ");
                 username = input.nextLine();
                    password = input.nextLine();
                System.out.println("Password: ");
                password = input.nextLine();
       
        if(S.Register(username, password, password, password, username)==true){ 
        System.out.println(" you are rejest to store owner Succesfuly");
        }else{
        System.out.println(" not correct storeowner name or password please try again");
        }
           break;
         }
           //login_class L=new login_class("mokhtar","mokhtar");
      }
   
        //in case of reg
  
 
  // U.search("bmw");
   U.Buy("bmw","2");
  // U.offer("bmw","2" ,"25000000" );
   /*
   String s=U.getusername();
   U.request(s, "absia  ", "258908569 ", "1234 ", "clothes");
   Adminstrator p=new Adminstrator("mohamed","258908569");
   p.readRequset(U);
   StoreOwner m=new StoreOwner(null,null,null,null,null);
   m.view();
   p.addBrand("nike");
    p.addBrand("nike");
   
       
    p.live();
   */
    }
  // TODO code application logic here
    }
    



/*
      StoreOwner d=new StoreOwner("fnuif","nfuf","kngg","jbgujg","jbg","fjbf");
Adminstrator p=new Adminstrator("amr","infui");
p.addproduct("infi", "fbuf", "fnafu", "fknfu");
d.StoreProduct();
      String Pname,Price,Pcat,Pquant;
     // Products p=new Products("amr","25","car","uur");
      
      //p.addproduct("amr", "25", "car", "18");
       
     // p.addproduct("ahmed", "25", "car", "18");
*/
   


/*
System.out.println("Username: ");
        username = input.nextLine();

      System.out.println("Password: ");
        password = input.nextLine();
        UserAccount reg = new UserAccount(username, password);
        if(reg.register(username, password)){ 
        System.out.println("Succesful");
        }else{
        System.out.println("feild!");
        }
        
        //in case of owner
        //in case of login
       StoreOwner s=new StoreOwner(null,null,null,null,null);
     String OwnerName, location, number, pass, StoreType;
      //  
         System.out.println("Username of owner: ");
        OwnerName = input.nextLine();
        System.out.println("Password: ");
        pass = input.nextLine();
        
        
       if( s.VerifyOwner(OwnerName, pass)){
            System.out.println("You are logged in!");
       }else{
            System.out.println("The username and password you entered are incorrect.");
       
       }
        
        //if he want to regist
        System.out.println("Username: ");
        OwnerName = input.nextLine();
        System.out.println("Password: ");
        pass = input.nextLine();
        System.out.println("location: ");
        location = input.nextLine();
        System.out.println("number: ");
        number = input.nextLine();
        
        System.out.println("store Type: ");
        StoreType = input.nextLine();
      //  StoreOwner s=new StoreOwner(null,null,null,null,null) ;//when i comment in something to work it
       s.OwnerRegt(OwnerName, location, number, pass, StoreType);
       // he should read automatically from adminproduct
       s.StoreProduct();
       
        //in case of adminstrator
       //in case of login
       
       String Aname=null;
        String Apass=null;
        System.out.println("Username: ");
        Aname = input.nextLine();
        System.out.println("Username: ");
        Apass = input.nextLine();
       Adminstrator admin=new Adminstrator( Aname, Apass);
      //in case of login 
       if(admin.AdmiVerify(Aname, Apass)){ 
        System.out.println("You are logged in!");
       }
        else{
            System.out.println("The username and password you entered are incorrect.");
                }
      
       
       //in case of reg
      
            //String Aname=null;//in case of reg delete comment
     //   String Apass=null;//in case of reg delete comment
        System.out.println("Username: ");
        Aname = input.nextLine();
        System.out.println("Password: ");
        Apass = input.nextLine();
      // Adminstrator admin=new Adminstrator( Aname, Apass);//in case of reg delete comment

       if(admin.AdminReg(Aname, Apass)){
           
        System.out.println("Succesful");
        }
       else{
        System.out.println("feild!");
        }
      //in case of add product
  String Pname=null, Pprice=null, Pcat=null, Pquant=null;
  System.out.println("product name: ");
        Pname = input.nextLine();
        System.out.println("product price: ");
        Pprice = input.nextLine();
        System.out.println("product cate: ");
        Pcat = input.nextLine();
        System.out.println("product quantity: ");
        Pquant = input.nextLine();
        admin.addproduct(Pname, Pprice, Pcat, Pquant);
    //    StoreOwner s=new StoreOwner(null,null,null,null,null);//when i comment all above to make admin work
         s.StoreProduct();
*/
