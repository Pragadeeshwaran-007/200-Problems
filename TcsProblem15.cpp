#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buyPrice = prices[0];
        int profit = 0;
        int n = prices.size();
        for(int i = 1 ; i < n; i++){
            if(prices[i] < buyPrice) buyPrice = prices[i];

            if(prices[i] - buyPrice > profit){
                profit = prices[i] - buyPrice;
            }
        }

        return profit;
    }
};

int main() {
    string s;
    getline(cin,s);
    stringstream ss(s);
    Solution S;
    vector<int> prices;
    int x;
    while (ss >> x) {
        prices.push_back(x);
    }
    int sol = S.maxProfit(prices);
    cout << sol << endl;
    return 0;
}
