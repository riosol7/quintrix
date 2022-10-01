import axios from "axios";

const get = () => {
    axios.get('http://localhost:8080/employee')
    .then(res => {
        const info = res.data;
        console.log(`GET info: `, info);
    })
    .catch(err => console.log(err));
}

get();

//Use JS async function to read file
// const fs = require('fs');

// try{
//     const file = 'test.txt';
//     console.log(fs.readFileSync(file, 'utf-8'));
// } catch (err) {
//     console.log(err)
// }