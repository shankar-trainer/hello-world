<?php 
interface Logger{
    public function log($message);
}
class FileLogger implements Logger{
    public function log($message){
        echo "\nfile logger ". $message ."";
    }
}

class DatabaseLogger implements Logger{
    public function log($message){
      echo "\ndatabase logger". $message ."";
    }
}
class LoggerFactory{
    static function create($name){
        // switch($name){
        //     case "file":
        //         return new FileLogger();
        //     case "db":
        //         return new DatabaseLogger();
        //     default:
        //        throw new Exception("\ninvalid Logger type");
        // };
        return match ($name) {
            'file' => new FileLogger(),
            'db'   => new DatabaseLogger(),
            default => throw new Exception("\nInvalid logger type"),
        };

    }
}
try{
    $logger=LoggerFactory::create("file");
    $logger->log("file creatinon logging");
    $logger=LoggerFactory::create("db");
    $logger->log("database creation logging ");
  
    $logger=LoggerFactory::create("hello");
    $logger->log("hello logging ");
}
catch(Exception $e){
    echo "". $e->getMessage() ."";
}
?>