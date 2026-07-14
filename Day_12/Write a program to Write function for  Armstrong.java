public class Main{
static boolean isArmstrong(int n){
int temp=n,sum=0,digits=0;
while(temp>0){
digits++;
temp/=10;
}
temp=n;
while(temp>0){
int rem=temp%10;
sum+=(int)Math.pow(rem,digits);
temp/=10;
}
return sum==n;
}
public static void main(String[] args){
int num=153;
if(isArmstrong(num))
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}
