matrixA = [
    [1, 2],
    [3, 4]
];
matrixB = [
    [5, 6],
    [7, 8]
];


function matrixAddition(matrixA, matrixB) {
    const result = [];
    
    let noOfRows = matrixA.length;
    let noOfCols = matrixA[0].length;


    for (let i = 0; i < noOfRows; i++) {
        
        result.push([]);
        
        for (let j = 0; j < noOfCols ; j++) {
            result[i][j] = matrixA[i][j] + matrixB[i][j];
        };
	}
    return result;
};


matricC = matrixAddition(matrixA,matrixB);
console.log(matricC)
