2<?php 
// require("Creator.php");
require_once("ConcreteProduct2.php"); 

class ConcreteCreator2 extends Creator{
    public function initiator() : Product{
        echo "Concrete creator is utilizing Product 2\n"; 
        $this->someAction();
        return new ConcreteProduct2(); 
    }
    public function someAction():string{
        $product = new ConcreteProduct2();
        echo $product->doAction1(); 
        echo "\n";
        return "Concrete creator is doing some action with Product 2\n"; 
    } 
}