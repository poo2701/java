class LeapYear{
public static void main(String[] args)
{
int year=1900;
if(year%400==0)
{System.out.println("Leap year");}

else
if(year%100==0)
{
System.out.println("not_leap_year");
}
else
if(year%4==0)
{
System.out.println("leap_year");
}
else
{System.out.println("Not a leap_year");
}
}} 