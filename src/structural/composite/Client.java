package structural.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Store s1=new Store(10000,"Zsqr");
		Store s2=new Store(20000,"Rave3");
		Store s3=new Store(30000,"SouthX");
		
		City c1=new City("Kanpur");
		c1.addLeaf(s1);
		c1.addLeaf(s2);
		c1.addLeaf(s3);
		
		Store s4=new Store(3000,"Ambience");
		Store s5=new Store(4000,"RaveMN");
		Store s6=new Store(5000,"STAR");
		
		City c2=new City("Gurgaon");
		c1.addLeaf(s4);
		c1.addLeaf(s5);
		c1.addLeaf(s6);
		
	System.out.println(c1.getProfit());
		
	}

}
