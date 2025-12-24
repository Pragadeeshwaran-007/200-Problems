#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums){
        int n = nums.size();
        vector<int> arr(n);
        int res = 1, zeros = 0;
        for(int num : nums){
            if(num == 0) zeros++;
            else{
                res *= num;
            }
        }
        for(int i = 0 ; i < n ;i++){
            if(zeros > 1 ){
                arr[i] = 0;
            }
            else if(zeros == 0){
                arr[i] = res/nums[i];
            }
            else{
                if(nums[i] == 0){
                    arr[i] = res;
                }
                else{
                    arr[i] = 0;
                }
            }
        }

        return arr;
    }
};
int main() {
    string s;
    getline(cin,s);
    stringstream ss(s);
    Solution S;
    vector<int> nums;
    int x;
    while (ss >> x) {
        nums.push_back(x);
    }
    vector<int> res = S.productExceptSelf(nums);
    for (int num : res) {
        cout << num << " ";
    }
    return 0;
}
