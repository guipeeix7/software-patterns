<?php 
    require_once('Decorator.php');
    class ConcreteDecorator2 extends Decorator {
        public function operation(){
            return $this->component->operation(). " Decorator 2 string: ". "hi babe"; 
        }
    }