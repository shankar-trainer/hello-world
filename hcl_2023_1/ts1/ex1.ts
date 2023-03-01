import * as fs from 'fs';
const word=  fs.readFileSync('./words.txt','utf-8');
console.log(word);