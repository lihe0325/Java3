# 计G201 李赫 2020322061  
## 实验目的  
掌握Java中抽象类和抽象方法的定义；   
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法  
了解异常的使用方法，并在程序中根据输入情况做异常处理  
## 实验内容  
1.某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
2.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。   
3.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。    
编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。  
## 实验要求  
1.在博士研究生类中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。
## 关键代码  
设计两个管理接口：学生管理接口和教师管理接口。
```
 Student[] s = new Stu[2];
	        s[0] = new Stu("张三", "男", 20);
	        s[1] = new Stu("李四", "男", 21);
 Teacher[] t = new Stu[2];
	        t[0] = new Stu("张三", "男", 20);
	        t[1] = new Stu("李四", "男", 21);
```
利用for循环输入学费与薪资。
```
 for (int j = 0; j < s.length; j++) {
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("请输入" + s[j].getName() + "的学费：");
	            int tuition = scanner.nextInt();
	            System.out.print("请输入" + t[j].getName() + "的薪水：");
	            int salary = scanner.nextInt();
	            s[j].payTuition(tuition);
	            t[j].paySalary(salary);
	        }
```
## 实验结果
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/ruAMsa53pVQWN7FLK88i5qDczczOQgEN6MFXFWfn64hRcOS9boJkXmUC75aUTK33lk9sLbEFNIiTrxJVnjzGmoFZ2b0Gjc*ukX0X9qwsOnk!/b&bo=mAEUAQAAAAADB64!&rf=viewer_4)
## 实验感想
掌握了Java中抽象类和抽象方法的定义；     
基本掌握了Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法。  
