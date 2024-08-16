var decodeMessage = function(key, message) {
    var map = {};
    let intVal = 97; 

    for (let char of key) {
        if (char !== ' ' && !map[char]) { 
            map[char] = String.fromCharCode(intVal);
            intVal++;
        }
    }

    var str = "";

    for (let char of message) {
        if (map[char]) {
            str += map[char];
        } else {
            str += char; 
        }
    }

    return str;
};
