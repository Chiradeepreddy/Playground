#include<iostream>
using namespace std;
int main()
{
 float a,d,c,e;
  int p,r,t;
  cin>>p>>r>>t;
  a=(p*r*t)/100;
  d=a+p;
  c=a*0.02;
  e=d-c;
  cout<<a<<"\n";
  cout<<d<<"\n";
  cout<<c<<"\n";
  cout<<e;
  return 0;
}