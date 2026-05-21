<?php
class Counter{

static $count=0;
  function Count1(){
   self::$count++;
  }
}
$c=new Counter();
echo "count is ".Counter::$count;
$c->count1();
echo "count is ".Counter::$count;
$c->count1();
echo "count is ".Counter::$count;
$c->count1();




