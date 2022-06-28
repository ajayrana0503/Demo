package MedicalStore;

 public class Medicine
 {
	 private String Name;
	 private int Qnt;
	 private String Exp;
	 private float cp;
	 private float sp;
	 
	 public Medicine()
	 {
		 
	 }
	 
	 
	 public void setName(String name)
	 {
		 this.Name=name;
	 }
	 public void setQnt(int Qnt)
	 {
		 this.Qnt=Qnt;
	 }
	 public void setExp(String date)
	 {
		 this.Exp=date;
	 }
	 public void setCp(float cp)
	 {
		 this.cp=cp;
	 }
	 public void setSp(float sp)
	 {
		 this.sp=sp;
	 }
	 
	 public String getName(){return this.Name;}
	 public int getQnt(){return this.Qnt;}
	 public String getExp(){return this.Exp;}
	 public float getCp(){return this.cp;}
	 public float getSp(){return this.sp;}
	 
}
 
