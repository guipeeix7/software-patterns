<?php 
    require_once('Component.php');  

    class ConcreteComponent implements Component{
        public function __construct(){}

        public function operation(){
            return "Concrete component";
        }
    }