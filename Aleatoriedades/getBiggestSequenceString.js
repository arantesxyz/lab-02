

const getBiggestSequence = (str) => {
    const _getStr = () => {
      let str = ""
      for(let i = 1; i <= 1958; i++){
        str += i;
      }
      return str;
    }
    
    const _findBiggestString = (arr) => {
      return arr.reduce((total, current) => {
        if (current.length > total.length) total = current;
        return total;
      }, "")
    }
    
    if (!str) str = _getStr();
    return _findBiggestString(str.match(/([0-9])\1+/g));
  }
  
  const biggestSequence = getBiggestSequence()
  
  console.log({number: biggestSequence[0], sequenceSize: biggestSequence.length})