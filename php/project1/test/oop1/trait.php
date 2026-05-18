<?php 
 trait Logger{
    public function log($msg){
        echo "log ". $msg ;
    }
 }
trait Reader{
    public function read($file){
    echo "reading file".$file;
    }
}
class FileManager{
    use Logger,Reader;
    public function process($file){
        $this->log("starting ");
        $this->log("reading  ");
        $this->read($file);
    }

}
$file=new FileManager() ;
$file->process("hello") ;
?>