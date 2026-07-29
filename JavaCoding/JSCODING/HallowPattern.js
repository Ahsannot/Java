let n = 5 ;
for (let i = 1 ; i <= n ; i++){
    let row = "";
    for (let j = 1 ; j <= i ; j++){
        if (j === 1 || j === n || i === n || i === 1 ) {
            row = row + "*  ";
        } else {
            row = row + "   ";
        }
    }
    console.log(row);
}