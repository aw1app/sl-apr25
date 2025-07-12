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

    for (let i = 0; i < matrixA.length; i++) {
        
        result.push([]);
        
        for (let j = 0; j < matrixA[i].length; j++) {
            result[i][j] = matrixA[i][j] + matrixB[i][j];
        };
	}
    return result;
};


matricC = matrixAddition(matrixA,matrixB);
console.log(matricC)
