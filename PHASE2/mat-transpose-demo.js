matrixA = [
    [1, 2],
    [3, 4]
];


function matrixTranspose(matrixA) {
    const result = [];
    
    let noOfRows = matrixA.length;
    let noOfCols = matrixA[0].length;


    for (let i = 0; i < noOfRows; i++) {
        
        result.push([]); // create an empty row.
        
        for (let j = 0; j < noOfCols ; j++) {
            result[i][j] = matrixA[j][i]
        };
	}
    return result;
};


matricC = matrixTranspose(matrixA,matrixB);
console.log(matricC)
