matrixA = [
    [1, 2],
    [3, 4]
];
matrixB = [
    [5, 6],
    [7, 8]
];

console.log(matrixA);

function matrixAddition(matrixA, matrixB) {
    const result = [];

    for (let i = 0; i < matrixA.length; i++) {
        const row = [];

        for (let j = 0; j < matrixA[i].length; j++) {
            row.push(matrixA[i][j] + matrixB[i][j]);
        };

        result.push(row);
    }
    return result;
};

matricC = matrixAddition(matrixA,matrixB);
console.log(matricC)
