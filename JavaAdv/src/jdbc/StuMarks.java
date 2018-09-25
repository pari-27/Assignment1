package jdbc;
import java.util.*;
public class StuMarks implements Comparable{
	static Scanner sc =new Scanner(System.in);
	String id;
	float h,e,p,c,m,total;
	StuMarks(String id,float h,float e,float p,float c, float m){
		this.id=id;
		this.h=h;
		this.e=e;
		this.m=m;
		this.p=p;
		this.c=c;

	}
	float getTotal(){
		return(h+e+m+p+c);
	}
	public static void main(String[] args) {
		ArrayList as=new ArrayList();
		StuMarks sm;
		for(int i=0;i<2;i++){
			System.out.print("enter your id");
			String id = sc.next();
			System.out.println("Enter your marks \n------------------");
			System.out.print("Hindi:");
			float h=sc.nextFloat();
			System.out.print("English:");
			float e=sc.nextFloat();
			System.out.print("Physics:");
			float p=sc.nextFloat();
			System.out.print("chemistry:");
			float c=sc.nextFloat();
			System.out.print("maths:");
			float m=sc.nextFloat();
			sm=new StuMarks(id,h,e,p,c,m); 
			float total =sm.getTotal();
			System.out.println("\n------------Total:"+total);
			as.add(sm);		
		}
		Iterator it=as.iterator();
		while(it.hasNext()){
			sm=(StuMarks)it.next();
			System.out.println("-----------------");
		}
		Collections.sort(as);
		System.out.println("After sort:");
		//System.out.println(" "+as);
		Iterator it1=as.iterator();
		while(it1.hasNext()){
			sm=(StuMarks)it1.next();
			System.out.println(sm.id);
			System.out.println("-----------------");
		}



	}
	@Override
	public int compareTo(Object o) {
		StuMarks sm=(StuMarks)o;
		if(this.total > sm.total)
		{return 1;
		}
		else
		return -1;
	}

}
