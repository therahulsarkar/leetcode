/**
 * @param {number[]} prices
 * @return {number}
 */
// var maxProfit = function (prices) {
//     let buy = prices[0];
//     let maxProfit = 0;

//     for (let i = 1; i < prices.length; i++) {
//         //If price today is more than our buying price then sell and compute max profit 
//         if (prices[i] > buy) { 
//             maxProfit = Math.max(maxProfit, prices[i] - buy);
//         } else {
//             //If not, that means stock price today is less than our previous buying price, so now buy today
//             buy = prices[i];
//         }
//     }
//     return maxProfit;
// };

var maxProfit = function (prices) {
    let buy = prices[0];
    let maxProfit = 0;
    let profit = 0;

    for (let i = 1; i < prices.length; i++) {
        profit = prices[i] - buy;
        maxProfit = Math.max(profit, maxProfit);
        buy = Math.min(buy, prices[i]);
    }
    return maxProfit;
};

