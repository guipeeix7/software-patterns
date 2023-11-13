<?php 
    require_once('Decorator.php');
    class ConcreteDecorator extends Decorator {
        public function operation(){
            return $this->component->operation(). " Decorator 1 string: ". "hi babe"; 
        }
    }