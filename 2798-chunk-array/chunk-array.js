/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const newarr=[];
    for(let i=0;i<arr.length;i+=size){
        newarr.push(arr.slice(i,i+size));
    }
    return newarr;
};
