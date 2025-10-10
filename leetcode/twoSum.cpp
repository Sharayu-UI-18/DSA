// Two Sum
//Problen link: https://leetcode.com/problems/two-sum/description/


#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // Check every possible pair of numbers
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums[i] + nums[j] == target) {
                    // Return their indices if they add up to the target
                    return {i, j};
                }
            }
        }
        // This line executes only if no solution is found (which won’t happen here)
        return {};
    }
};

int main() {
    Solution obj;

    // Example input
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;

    // Call the function
    vector<int> result = obj.twoSum(nums, target);

    // Print the result
    cout << "Indices: ";
    for (int index : result) {
        cout << index << " ";
    }
    cout << endl;

    return 0;
}
