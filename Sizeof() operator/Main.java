#include<iostream>
using namespace std;
int main()
{
  char x;
  int s;
  float z;
  double y;
  std::cin>>x;
  std::cin>>s;
  std::cin>>z;
  std::cin>>y;
  std::cout<<sizeof(x)<<"\n";
  std::cout<<sizeof(s)<<"\n";
  std::cout<<sizeof(z)<<"\n";
  std::cout<<sizeof(y)<<"\n";
}