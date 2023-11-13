<?php 
    require_once('Component.php'); 
    class Decorator implements Component{
        public $component;  
        public function __construct(Component $component){
            $this->component = $component; 
        }

        public function operation(){
            return "Decoraton implementation";
        }
    }