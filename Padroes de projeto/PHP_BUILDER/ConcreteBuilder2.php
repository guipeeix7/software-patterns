<?php 
require_once('Builder.php');
require_once('Product2.php');

class ConcreteBuilder2 implements Builder{
    private $product;

    public function __construct(){
        $this->reset();
    }

    public function reset(){
        $this->product = new Product2();
    }

    public function producePartA(){
        $this->product->parts[] = "Part A builded in Builder 2\n"; 
    }
    public function producePartB(){
        $this->product->parts[] = "Part B builded in Builder 2\n"; 
    }
    public function producePartC(){
        $this->product->parts[] = "Part C builded  in Builder 2\n"; 
    }

    public function getProduct(){
        $result = $this->product; 
        $this->reset();
        return $result; 
    }
}