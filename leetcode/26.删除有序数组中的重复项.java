/*
 * @Author: dongzhenyang1 dongzhenyang1@jd.com
 * @Date: 2023-02-26 17:19:00
 * @LastEditors: dongzhenyang1 dongzhenyang1@jd.com
 * @LastEditTime: 2023-02-26 17:45:52
 * @FilePath: /mylearn/Users/dongzhenyang1/.leetcode/26.删除有序数组中的重复项.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {

    // 双指针，左指针用来比较是否相等&标记放入位置，有指针用来向后遍历比较
    public int removeDuplicates(int[] nums) {
        int leftPtr = 0;
        int rightPtr = 1;
        for ( ; rightPtr < nums.length; rightPtr++) {
            if (nums[leftPtr] != nums[rightPtr]) {
                nums[++leftPtr] = nums[rightPtr];
            }
        }
        return ++leftPtr;
    }
}
// @lc code=end

