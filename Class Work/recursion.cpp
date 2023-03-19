#include <bits/stdc++.h>
using namespace std;

void fun(int n){
    if(n==0){
        return;
    }
    cout<<n<<endl;
    fun(n-1);
}


int main()
{
int tc;
fun(10);
// cin>>tc;
// while(tc--){
 
// }
 return 0;
}