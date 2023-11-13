<?php 
require_once('Target.php');
require_once('Service.php');

class Adapter implements Target{
    //Alternative
    // private Service $service; 
    // public function __construct(){
    //     $this->service = new Service();
    // }
    private $service; 
    public function __construct(Service $adaptee){
        $this->service = $adaptee; 
    }

    public function request(){
        return strrev($this->service->specific_request());
    }
}