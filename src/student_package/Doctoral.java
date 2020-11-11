package student_package;

import java.util.Scanner;

public class Doctoral implements Colleagestudent,Teacher{
	
	int doctoral=7000;  //第一位博士的薪水
	int doctoral2=6000;  //第二位博士的薪水
	int amount=doctoral*12; 
	int amount1=doctoral2*12;
	final double tex=0.03;     //薪水税额
	String name;              
	SchoolFinance sv=new SchoolFinance();
	int d=sv.getMoney();
	public void toshow() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("请输入姓名");
		 name=sc.nextLine();
		 System.out.println("请输入性别");
	     String sex=sc.next();
	     System.out.println("请输入年龄");
	     int age=sc.nextInt();
	     System.out.println("姓名："+name);
	     System.out.println("性别："+sex);
	     System.out.println("年龄："+age);
	}
     
	public void payment() {
		Doctoral Doctoral1 = new Doctoral();
		SchoolFinance  scw=new SchoolFinance();
		String str="请输入你要交的学费";
		scw.setMoney(10000);
		while(true) {
			System.out.println(str);
			Scanner sc=new Scanner(System.in);
			int id1;
			int b=scw.getMoney();
    	try {
    		id1=sc.nextInt();
    		if(id1==b) {
    			System.out.println("你的学费支付了："+id1+"元,支付成功");
         		break;
    		}else {
    			 System.out.println("你输入的有误");
    			 
    		}
     		
		} catch (Exception e) {
			str="您输入有误,请输入一个整数:";
			continue;
		} 	
     }
		
	}
	public void checkmany() {
		try {
			sv.setMoney(10000);
			d=sv.getMoney();
		} catch (Exception e) {
			System.out.println("你输入的不正确");
		}
		
		System.out.println("您查询的学费为"+d);
	}
	public void paysalary() {
		System.out.println("每个月发放的薪水为："+doctoral);
	}
	public void paysalary1() {
		System.out.println("每个月发放的薪水为："+doctoral2);
	}
    public void annual() {
    	System.out.println("你的年总收入是："+amount);
    }
    public void annual1() {
    	System.out.println("你的年总收入是："+amount1);
    }
    public void taxamount() {
    	System.out.println("该学生的税额款为："+(amount-d)*tex+"元");
    }
    public void taxamount1() {
    	System.out.println("该学生的税额款为："+(amount1-d)*tex+"元");
    }
    public void inquiresalary() {
    	System.out.println("每个月查询的薪水为："+doctoral);
    }
    public void inquiresalary1() {
    	System.out.println("每个月查询的薪水为："+doctoral2);
    }
    
}
