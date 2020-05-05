#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int adult=b*75;
  int child=c*30;
  int t=adult+child;
  if(t<=a)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}