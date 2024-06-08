/**
 * @param {string[]} dictionary
 * @param {string} sentence
 * @return {string}
 */
var replaceWords = function(dictionary, sentence) {
    let strArr = sentence.split(" ");
    dictionary = dictionary.sort((a,b) => a.length - b.length);
    
    for(let i = 0; i < strArr.length; i++){
        for(let j = 0; j < dictionary.length; j++){
             if(strArr[i].slice(0,dictionary[j].length) === dictionary[j]){
                strArr[i] = dictionary[j];
                break;
            }
        }
    }
    
    return strArr.join(" ");
};
