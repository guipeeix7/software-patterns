<?php 
require_once('Builder.php');
require_once('Product1.php');
class ConcreteBuilder1 implements Builder{
    private $product;


    public function __construct(){
        $this->reset();
        
    }

    public function reset(){
        $this->product = new Product1();
    }

    public function producePartA(){
        $this->product->parts[] = "Part A builded in Builder 1\n"; 
        return $this;
    }
    public function producePartB(){
        $this->product->parts[] = "Part B builded in Builder 1\n"; 
        return $this;
    }
    public function producePartC(){
        $this->product->parts[] = "Part C builded  in Builder 1\n"; 
        return $this;
    }

    public function getProduct(){
        $result = $this->product; 
        $this->reset();
        return $result; 
    }
}