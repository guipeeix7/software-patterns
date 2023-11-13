<?php 
require_once ("Product.php"); 
class ConcreteProduct2 implements Product{
    public function doAction1():string{
        return "action 1 realized by concrete product 2\n"; 
    }
    public function doAction2():string{
        return "action 2 realized by concrete product 2\n"; 
    }
}