package oo;

import java.util.Scanner;

public class Course {
	
	    public static void main(String[] args) {
	        Student[] s = new Stu[2];
	        s[0] = new Stu("张三", "男", 20);
	        s[1] = new Stu("李四", "男", 21);
	        Teacher[] t = new Stu[2];
	        t[0] = new Stu("张三", "男", 20);
	        t[1] = new Stu("李四", "男", 21);

	        for (int j = 0; j < s.length; j++) {
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("请输入" + s[j].getName() + "的学费：");
	            int tuition = scanner.nextInt();
	            System.out.print("请输入" + t[j].getName() + "的薪水：");
	            int salary = scanner.nextInt();
	            s[j].payTuition(tuition);
	            t[j].paySalary(salary);
	        }

	        System.out.println("\n===============纳税金额===============");
	        
	        final double tax_rate = 0.1;
	        for (int i = 0; i < s.length; i++) {
	            double net = t[i].checkSalary() * 12 - s[i].checkTuition();
	            double totalTax = net * tax_rate;
	            System.out.printf("%s的年应纳税金额为：%.2f\n", t[i].getName(), totalTax);  
	            
	        }
	    }
	}

	interface Student {
	    void payTuition(int tuition);
	    int checkTuition();
	    String getName();
	}

	interface Teacher {
	    void paySalary(double salary);
	    double checkSalary();
	    String getName();
	}

	class Stu implements Student, Teacher {
	    public String name;
	    public String sex;
	    public int age;
	    public int tuition;
	    public double salary;

	    public Stu(String name, String sex, int age) {
	        this.name = name;
	        this.sex = sex;
	        this.age = age;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public void payTuition(int tuition) {
	        this.tuition = tuition;
	    }

	    public int checkTuition() {
	        return this.tuition;
	    }

	    public void paySalary(double salary) {
	        this.salary = salary;
	    }

	    public double checkSalary() {
	        return this.salary;
	    }
	}

