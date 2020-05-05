#include<iostream>
using namespace std;
int main()
{
  int r,c,d,n,i;
  cin>>r>>d>>n;
  for(i=r+1;i<=2*r;i++)
  {
    if(i==n)
      c=1;
  }
  for(i=(r*r)-r;i>=(r*r)-(2*r);i--)
  {
    if(i==n)
      c=1;
  }
  if(c==1)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}