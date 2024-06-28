package application;
import java.util.*;


class Seller{
	int sp;
	int cp;
	int pl;
	void acceptSellingCostPrice(int sp,int cp) {
		this.cp=cp;
		this.sp=sp;
	}
	void  showProfitLoss() {
      int 	pl=sp-cp;
		if(pl>0)
		    {
			  System.out.printf("Profit =",+pl);
			}
		else if(pl<0)
		{
			System.out.printf("Loss = ",-pl);
		}
		else {
			System.out.println("No profit  no Loss");
		}
	}
}


public class SellerApp {

	public static void main(String[] args) {
		int sp,cp;
		Scanner xyz=new  Scanner(System.in);
		System.out.println("Enter the cost price");
		cp=xyz.nextInt();
		System.out.println("Enter the selling price");
		sp=xyz.nextInt();
		Seller s=new Seller();
        s.acceptSellingCostPrice(sp, cp);
        s.showProfitLoss();
	}

}
