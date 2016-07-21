package test;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
		//1、接受控制台输入
		System.out.println("---计算程序---");
		System.out.println("输入第一操作数");
		Scanner scanner=new Scanner(System.in);
		String strNum1=scanner.nextLine();
		
		System.out.println("输入运算符");
		String oper=scanner.nextLine();
		
		System.out.println("输入第二操作数");
		String strNum2=scanner.nextLine();
		//2、进行运算
		double result=0;
		if("+".equals(oper)){
			Operation jia=new JiaOper();
			jia.setNum1(Double.parseDouble(strNum1));
			jia.setNum2(Double.parseDouble(strNum2));
			result=jia.getResult();
		}else if("-".equals(oper)){
			Operation jian=new JianOper();
			jian.setNum1(Double.parseDouble(strNum1));
			jian.setNum2(Double.parseDouble(strNum2));
			result=jian.getResult();
		}else if("*".equals(oper)){
			Operation cheng=new ChengOper();
			cheng.setNum1(Double.parseDouble(strNum1));
			cheng.setNum2(Double.parseDouble(strNum2));
			result=cheng.getResult();
		}else if("/".equals(oper)){
			if(Double.parseDouble(strNum2)==0){
				System.out.println(" 除数不能为0");
				return;
			}else{
				Operation chu=new ChuOper();
				chu.setNum1(Double.parseDouble(strNum1));
				chu.setNum2(Double.parseDouble(strNum2));
				result=chu.getResult();
			}
			
		}
		
		//3、返回结果
		
		System.out.println("计算结果:"+result);
	}
	
	
}
