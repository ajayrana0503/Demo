import MedicalStore.*;
import java.util.*;

class Main
 {
	 public static void main(String args[])
	 {
		 act a= new act();
		
		 
		 System.out.println("Medical Store project");
		 
		 boolean y= true;
		 while(y){
			 
		 
		 System.out.println("Choose one option");
		 System.out.println("1:- Add Medicine");
		 System.out.println("2:- Remove Medicine");
		 System.out.println("3:- Update Quantity");
		 System.out.println("4:- StockList");
		 System.out.println("5:- MedicineInfo");
		 System.out.println("6:- SellMedicine");
		 System.out.println("7:- Show profit");
		 System.out.println("8:- Exit application");
		// System.out.println("Medical Store project");
		// System.out.println("Medical Store project");
		 //System.out.println("Medical Store project");
         Scanner sc =new Scanner(System.in);
		 int x=sc.nextInt();
		 switch(x)
		 {
			case 1:
			
			{ Medicine m=new Medicine(); 
			  System.out.println("Medicine Name:-");
			  m.setName(sc.next());
			  System.out.println("Medicine Quantity");
			  m.setQnt(sc.nextInt());
			  System.out.println("Medicine expirydate-");
			  m.setExp(sc.next());
			  System.out.println("Medicine costprice-");
			  m.setCp(sc.nextFloat());
			  System.out.println("Medicine Sellingprice-");
			  m.setSp(sc.nextFloat());
			  a.add(m);
			  System.out.println("Added Successfully");
			
			  
              break;
				
			} 
			case 2:
			{
				System.out.println("Name to remove");
			  String s=sc.next();
			  a.remove(s);
			  System.out.println("Remove successfully");
			  break;
			  
			}
			case 3:
			{
				System.out.println("Enter medicine name");
				String s=sc.next();
				System.out.println("Enter new Quantity");
				int n=sc.nextInt();
				a.update(s,n);
				System.out.println("update successfully");
				break;
				
			} 
			case 4:{
				a.display();
				break;
			}
			case 5:{
				System.out.println("Enter medicine name");
				String s=sc.next();
				a.display(s);
				break;
			}
			case 6:{
				System.out.println("Enter medicine name");
				String s=sc.next();
				System.out.println("Enter medicine Quantity");
				int q=sc.nextInt();
				int p=a.sell(s,q);
				if(p==0){System.out.println("Not enough stock");
				}
				else{
					System.out.println("Sold successfully");
				}
				break;
			}
			
			case 7:{
				System.out.println(a.getprofit());
				break;
			}
			
			case 8: y=false; break;
			
			default:{System.out.println("Wrong option");}
			}
			
		 }		 
	 }
 }