package student_package;

import java.util.Scanner;

public class Doctoral implements Colleagestudent,Teacher{
	
	int doctoral=7000;  //��һλ��ʿ��нˮ
	int doctoral2=6000;  //�ڶ�λ��ʿ��нˮ
	int amount=doctoral*12; 
	int amount1=doctoral2*12;
	final double tex=0.03;     //нˮ˰��
	String name;              
	SchoolFinance sv=new SchoolFinance();
	int d=sv.getMoney();
	public void toshow() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("����������");
		 name=sc.nextLine();
		 System.out.println("�������Ա�");
	     String sex=sc.next();
	     System.out.println("����������");
	     int age=sc.nextInt();
	     System.out.println("������"+name);
	     System.out.println("�Ա�"+sex);
	     System.out.println("���䣺"+age);
	}
     
	public void payment() {
		Doctoral Doctoral1 = new Doctoral();
		SchoolFinance  scw=new SchoolFinance();
		String str="��������Ҫ����ѧ��";
		scw.setMoney(10000);
		while(true) {
			System.out.println(str);
			Scanner sc=new Scanner(System.in);
			int id1;
			int b=scw.getMoney();
    	try {
    		id1=sc.nextInt();
    		if(id1==b) {
    			System.out.println("���ѧ��֧���ˣ�"+id1+"Ԫ,֧���ɹ�");
         		break;
    		}else {
    			 System.out.println("�����������");
    			 
    		}
     		
		} catch (Exception e) {
			str="����������,������һ������:";
			continue;
		} 	
     }
		
	}
	public void checkmany() {
		try {
			sv.setMoney(10000);
			d=sv.getMoney();
		} catch (Exception e) {
			System.out.println("������Ĳ���ȷ");
		}
		
		System.out.println("����ѯ��ѧ��Ϊ"+d);
	}
	public void paysalary() {
		System.out.println("ÿ���·��ŵ�нˮΪ��"+doctoral);
	}
	public void paysalary1() {
		System.out.println("ÿ���·��ŵ�нˮΪ��"+doctoral2);
	}
    public void annual() {
    	System.out.println("������������ǣ�"+amount);
    }
    public void annual1() {
    	System.out.println("������������ǣ�"+amount1);
    }
    public void taxamount() {
    	System.out.println("��ѧ����˰���Ϊ��"+(amount-d)*tex+"Ԫ");
    }
    public void taxamount1() {
    	System.out.println("��ѧ����˰���Ϊ��"+(amount1-d)*tex+"Ԫ");
    }
    public void inquiresalary() {
    	System.out.println("ÿ���²�ѯ��нˮΪ��"+doctoral);
    }
    public void inquiresalary1() {
    	System.out.println("ÿ���²�ѯ��нˮΪ��"+doctoral2);
    }
    
}
