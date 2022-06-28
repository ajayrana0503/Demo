import MedicalStore.*;
import java.util.*;
public interface Inter
 {
	 public void add(Medicine m);
	 public int update(String name,int Qnt);
	 public ArrayList getall();
	 public boolean contains(Medicine m);
	 public int remove(String name);
	 public void display();
	 public int display(String name);
	 public int sell(String name,int Qnt);
	 public float getprofit();
	 
 }