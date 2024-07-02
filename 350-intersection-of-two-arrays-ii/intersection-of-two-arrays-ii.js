/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function (nums1, nums2) {
    let map = {}
    let result = []

    for (let x of nums1) {
        if (!map[x]) {
            map[x] = 1
        }
        else {
            map[x]++
        }
    }

    for (let x of nums2) {
        if (map[x] > 0) {
            result.push(x)
            map[x]--
        }


    }
    return result;
};