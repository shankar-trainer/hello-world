<?php

class Book{
	
	private $isbn;
	private $author;
	private $cost;
	
	public function setIsbn($isbn)
	{
		$this->isbn=$isbn;
	}
	

	public function setAuthor($author){
		$this->author=$author;
	}

	public function setCost($cost){
		$this->cost=$cost;
	}

    public function getIsbn(){
		return $this->isbn;
	}

    public function getAuthor(){
		return $this->author;
	}
		

    public function getCost(){
		return $this->cost;
	}
}

$book=new Book();
$book->setIsbn(10001);
$book->setAuthor('php for professional');
$book->setCost(1200);

echo 'book details ';
echo  "\nisbn ".$book->getIsbn(); 
echo  "\nauthor ".$book->getAuthor(); 
echo  "\nisbn ".$book->getCost(); 
?>
