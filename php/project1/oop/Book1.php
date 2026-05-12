<?php
class Book1{
	
	private int  $isbn;
	private string $author;
	private float $cost;
	
	public function setIsbn(int $isbn):void 
	{ 
		$this->isbn=$isbn;
	}
	

	public function setAuthor(string $author):void{
		$this->author=$author;
	}

	public function setCost(float $cost):void{
		$this->cost=$cost;
	}

         public function getIsbn():int{
		return $this->isbn;
	}

        public function getAuthor():string{
		return $this->author;
	}
		

       public function getCost():float{
		return $this->cost;
	}
}

    $book=new Book1();
//  $book->setIsbn(10001);
    $book->setIsbn(8990);
    $book->setAuthor('php for professional');
    $book->setCost(1200);

    echo 'book details ';
    echo  "\nisbn ".$book->getIsbn(); 
    echo  "\nauthor ".$book->getAuthor(); 
    echo  "\nisbn ".$book->getCost(); 
 ?>
