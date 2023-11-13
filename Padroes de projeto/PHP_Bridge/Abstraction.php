<?php 
require_once('Implementation.php'); 
class Abstraction{
    protected Implementation $implementation; 
    public function __construct(Implementation $implementation){
        $this->implementation = $implementation; 
    }
    public function methodA(){
        return "implemented method A from Abstraction Class ".$this->implementation->implementedMethodA();
    }

    public function methodB(){
        return "implemented method B from Abstraction Class ". 
        $this->implementation->implementedMethodB(); ;
    }
}