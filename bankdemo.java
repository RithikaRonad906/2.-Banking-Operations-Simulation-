// import java.lang.*;
import java.util.*;

class bank
{
private String nm;
private long accno,wamt,damt,bal;
Scanner sc=new Scanner(System.in);

public void get()
{
System.out.println("Enter Name");
nm=sc.next();
System.out.println("Enter Accno");
accno=sc.nextLong();
System.out.println("Enter Balance");
bal=sc.nextLong();
}

public void withamt()
{
System.out.println("Enter withdraw amt");
wamt=sc.nextLong();
if(wamt>bal)
{
System.out.println("Insufficient Balance");
}
else 
{
bal=bal-wamt;
}
}

public void deamt()
{
System.out.println("Enter deposit amt");
damt=sc.nextLong();
bal=bal+damt;
}

public void show()
{
System.out.println("===================Acconut Details===================");
System.out.println("name:="+nm);
System.out.println("Account no:="+accno);
System.out.println("balance:="+bal);
}
}

public class bankdemo
{
public static void main(String args[])
{
bank b1=new bank();
Scanner sc=new Scanner(System.in);
int ch;
do
{
System.out.println("1 create account");
System.out.println("2 deposit");
System.out.println("3 withdraw");
System.out.println("4 balance view");
System.out.println("5 exit");
System.out.println("enter your choice");
ch=sc.nextInt();
switch (ch)
{
case 1:b1.get();
       break;
case 2:b1.deamt();
       break;
case 3:b1.withamt();
       break;
case 4:b1.show();
       break;
case 5:System.out.println("invalid choice");
       break;
}
}
while(ch!=5);
sc.close();
}
}