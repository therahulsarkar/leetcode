/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let current = prices[0];
    let maxProfit = 0;

    for(let i=0; i<prices.length; i++){
       if(prices[i] > current){
           maxProfit = Math.max(maxProfit, prices[i]-current);
       } else{
           current = prices[i]
       }
    }
    return maxProfit;
};