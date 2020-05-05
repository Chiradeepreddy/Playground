#include<iostream>
using namespace std;
int main()
{
 int n,b,c,h,y,m;
  cin>>n;
  b=n%10;
  m=n;
  while(n!=0)
  {
    h=n%10;
    y++;
    n/=10;
  }
  if(y==3)
    cout<<b;
  else if(y==4)
    cout<<b+h;
  else
    cout<<b;
  return 0;
}