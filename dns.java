import java.net.*; 
import java.io.*; 
import java.util.*; 
public class DNS 
{ 
public static void main(String[] args) 
{ 
int n; 
Scanner sc=new Scanner(System.in);
do 
{ 
System.out.println("\n Menu: \n 1. DNS 2.Exit \n"); 
System.out.println("\n Enter your choice"); 
n = sc.nextInt(); 
if(n==1) 
{ 
try 
{ 
System.out.println("\n Enter Host Name "); 
sc.nextLine();
String hname=sc.nextLine(); 
InetAddress address; 
address = InetAddress.getByName(hname); 
System.out.println("Host Name: " + address.getHostName()); 
System.out.println("IP: " + address.getHostAddress()); 
} 
catch(IOException ioe) 
{ 
ioe.printStackTrace(); 
} 
} 
}while(!(n==2)); 
} 
} 
