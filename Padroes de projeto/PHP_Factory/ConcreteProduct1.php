<?php 
require_once ("Product.php"); 
class ConcreteProduct1 implements Product{
    public function doAction1(): string{
        return "action 1 realized by concrete product 1\n"; 
    }
    public function doAction2():string{
        return "action 2 realized by concrete product 1\n"; 
    }
}