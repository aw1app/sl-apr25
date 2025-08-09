matrixA = [
    [1, 2],
    [3, 4]
];
matrixB = [
    [5, 6],
    [7, 8]
];


function matrixMultiplication(matrixA, matrixB) {
    const result = [];

    let noOfRows = matrixA.length; // no of rows in A
    let noOfCols = matrixB[0].length; // no of cols in B


    for (let i = 0; i < noOfRows; i++) { // for each row

        result.push([]);
 
        for (let j = 0; j < noOfCols; j++) { // for every col
            let sum = 0;

            for (let k = 0; k < matrixA[0].length; k++) { // matrixA[0].length = matrixB.length 
                sum = sum + matrixA[i][k] * matrixB[k][j];
            };           
            result[i][j] = sum;
        }

    }
    return result;
};


matricC = matrixMultiplication(matrixA, matrixB);
console.log(matricC)
