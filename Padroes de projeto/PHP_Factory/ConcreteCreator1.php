<?php 
// require("Creator.php");
require_once("ConcreteProduct1.php"); 

class ConcreteCreator1 extends Creator{
    public function initiator() : Product{
        echo "Concrete creator is utilizing Product 1\n"; 
        $this->someAction();

        return new ConcreteProduct1(); 
    }
    public function someAction():string{
        $product = new ConcreteProduct1();
        echo $product->doAction1();         
        echo "\n";

        return "Concrete creator is doing some action with Product 2\n"; 
    } 
}