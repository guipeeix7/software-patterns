<?php 
require_once('Implementation.php');

class ConcreteImplementationA implements Implementation{
    public function __contruct(){
        
    }
    public function implementedMethodA(){
        return "Implemented call to Method A from implementation ".self::className(); 
    }
    public function implementedMethodB(){
        return "Implemented call to Method B from implementation ".self::className(); 
    }
    public function implementedPrivateMethodC(){
        return "Implemented call to Method C from implementation ".self::className(); 
    }

    private static function className(){
        return "class A"; 
    }
}