#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a,b;
  if(a%400==0)
    cout<<a<<" is a leap year";
  else if(a%4==0)
    cout<<a<<" is a leap year";
  else
    cout<<a<<" is not a leap year";
}