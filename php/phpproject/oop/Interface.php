<?php
interface Shape
{
    public function draw();
}
class Hello {}
interface Square
{
    public function area();
}

interface Circle extends Shape, Square {}
class Rectangle extends Hello implements Shape, Square
{
    private  $width;
    private  $length;
    public function __construct($width, $length)
    {
        $this->width = $width;
        $this->length = $length;
    }

    public function area()
    {
        echo "<br>area of rectnagle is " . $this->width * $this->length;
    }


    public function draw()
    {
        echo "<br>draw recatngle with width" . $this->width . " and length" . $this->length . "";
    }
}
