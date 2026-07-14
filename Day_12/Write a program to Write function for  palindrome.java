public class Main{
static boolean isPalindrome(int n){
int temp=n,rev=0;
while(n>0){
rev=rev*10+n%10;
n=n/10;
}
return temp==rev;
}
public static void main(String[] args){
int num=121;
if(isPalindrome(num))
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
