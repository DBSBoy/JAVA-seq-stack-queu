package Test;



import Sequencelist.SLType;
import Sequencelist.data;

import java.util.Scanner;


@SuppressWarnings("ALL")
public class SLtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,i,n=1;
		data pda;
		SLType sl=new SLType();
		String key;
		System.out.println("Here is sequence list's operation demo:");
		sl.SLInit(sl);
		System.out.println("Initialization completed!");
		Scanner in=new Scanner(System.in);
		do {
			System.out.println("input the point's(key name age):");
			data da=new data();
			da.setKey(in.next());
			da.setName(in.next());
			da.setAge(in.nextInt());
			if(da.getAge()!=0) {
				if(sl.SLadd(sl,da)==0) {
					break;
				}
			}
			else {
				
				break;
			}
			
		}while(true);
		System.out.println(" All the sequence list's point:");
		sl.SLALL(sl);
		
		System.out.print("which point do you want to take?input it's serial number:-->");
		i=in.nextInt();
		pda=sl.slfindbynum(sl, i);
		if(pda!=null) {
			System.out.printf("the %d point is:(%d,%s,%s)",i,pda.getAge(),pda.getName(),pda.getKey());
		}
		System.out.printf("seach by key:");
		key=in.next();
		i=sl.slfindbycont(sl, key);
		pda=sl.slfindbynum(sl, i);
		if(pda!=null) {
			System.out.printf("the %d point is:(%d,%s,%s)",i,pda.getAge(),pda.getName(),pda.getKey());

		}
		
		/*
		 * d=sl.SLLength(sl); System.out.println(d);
		 */
		
		
	}

}
