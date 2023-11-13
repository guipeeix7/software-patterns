<?php
require_once('Component.php');

class leaf extends Component{ 
    public $total; 

    public function __contruct(){
        $this->total = rand(1,250); 
    }

    public function getLeafTotal(){
        return $this->total; 
    }
}