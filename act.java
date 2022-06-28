import MedicalStore.*;
import java.util.*;



public class act implements Inter{
	
	ArrayList<Medicine> ar= new ArrayList<Medicine>();
	private float profit=0;
	
	public act(){
	}
	
	public void setprofit(float profit){
		this.profit= profit;
	}
	
	public float getprofit(){
		return this.profit;
	}
	
	
	
	public void add(Medicine m){
	
		ar.add(m);
	}
	
	public ArrayList getall(){
		return ar;
	}
	
	public boolean contains(Medicine m){
		return ar.contains(m);
	}
	
	public int remove(String name){
		for(Medicine x:ar){
			if(x.getName().equalsIgnoreCase(name)){
				ar.remove(x);
				return 1;	
			}
			
		}
		return 0;
	}
	
	public void display(){
		System.out.println("Name"+" "+"Quantity"+" "+"Expirydt"+" "+"CP"+" "+"SP");
		System.out.println("-----------");
		for(Medicine x:ar){
			
			System.out.println(x.getName()+" "+x.getQnt()+" "+x.getExp()+" "+x.getCp()+" "+x.getSp());
		}
				System.out.println("-----------");
		
	}
	public int display(String name){
		for(Medicine x:ar){
			if(x.getName().equalsIgnoreCase(name)){
				System.out.println(x.getName()+" "+x.getQnt()+" "+x.getExp()+" "+x.getCp()+" "+x.getSp());
				return 1;	
			}
			
		}
		return 0;
	}
	public int update(String name,int Qnt)
	{
      for(Medicine x:ar){
			if(x.getName().equalsIgnoreCase(name)){
				x.setQnt(Qnt);
				return 1;	
			}
			
		}
		return 0;
		
	}
	
	public int sell(String name,int Qnt)
	{
		for(Medicine x:ar){
			if(x.getName().equalsIgnoreCase(name)){
				int q1=x.getQnt();
				int q2=q1-Qnt;
				if(q2<=0){return 0;}
				else{
				
				float cp= x.getCp();
				float sp= x.getSp();
				float pr1= this.getprofit();
				float pr= (sp-cp)*Qnt;
				this.setprofit(pr1+pr);
				x.setQnt(q2);
				return 1;	
				}
			}
			
		}
		return 0;
		
	}
	
	
}