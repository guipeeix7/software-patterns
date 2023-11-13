<?php 
require_once('Abstraction.php');
require_once('ConcreteImplementationB.php');


class RefinedAbstraction extends Abstraction{  
    public function methodA(){
        return "This is a refined method from Abstraction child ".$this->implementation->implementedMethodA();
    }
}