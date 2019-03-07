import java.io.*;
import java.util.*;
class cipher
{
public static void main(String args[])
{
int c,d;
Scanner sc=new Scanner(System.in);
int f="",g="";
String a="abcdefghijklmnopqrstuvwxyz";
int k=sc.nextInt();
String s=sc.next;

for(int i=0;i<a.length();i++)
{
 for(int j=0;j<s.length();j++)
{
  if(a.length==s.length)
{
 c=(j+k)%26;
 f=f+a.charAt[i];
}
}
}
System.out.println(String.toUpperCase());
System.out.println(n);
for(int i=0;i<f.length();i++)
{
 for(int j=0;j<s.length();j++)
{
  if(f.length==s.length)
{
 d=(j-k)%26;
 h=h+a.charAt[i];
}
}
}
}
}