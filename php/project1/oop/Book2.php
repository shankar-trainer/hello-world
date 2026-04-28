<?php

class Book2{
	
	private int  $isbn;
	private string $author;
	private float $cost;
	
	public function setIsbn(int $isbn):void 
	{ 
	 if($isbn<0){
	    //echo "invalid isbn";
	     throw new Exception("invalid Isbn");
	    }
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
	try{
		$book=new Book2();
	    $book->setIsbn(10001);
		//$book->setIsbn(-90);
		$book->setAuthor('php for professional');
		$book->setCost(1200);

		echo 'book details ';
		echo  "\nisbn ".$book->getIsbn(); 
		echo  "\nauthor ".$book->getAuthor(); 
		echo  "\nisbn ".$book->getCost(); 
	}
     catch(Exception $e){
		 echo "Error ".$e->getMessage();
	 }
 ?>
