#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t-- > 0){
	    long long n;
	    cin >> n;
	    vector<long long> arr(n);
	    for(int i = 0; i < n; i++){
	        cin >> arr[i];
	    }
	    sort(arr.begin(), arr.end());
	    long long sum = 0;
	    vector<long long> ans;
	    for(int i = n-1; i >=0; i--){
	        sum = sum + arr[i];
	        ans.push_back(sum);
	    }
	    reverse(ans.begin(), ans.end());
	    for(auto i: ans){
	        cout << i << " ";
	    }
	    cout << endl;
	}
	return 0;
}
