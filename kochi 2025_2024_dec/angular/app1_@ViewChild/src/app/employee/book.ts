export class Book {
constructor(public title: string, public author: string) {
  this.title = title;
  this.author = author;
}
// setTitle(title: string) {
//   this.title = title;
// }
// setAuthor(author: string) {
//   this.author = author;
// }
getTitle() {
  return this.title;
}
getAuthor() {
  return this.author;
}

}
