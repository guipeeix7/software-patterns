<?php 
    require_once('ConcreteBuilder1.php'); 
    require_once('ConcreteBuilder2.php'); 
    // require_once('Builder');
    class Director{
        private $builder; 
        // public function __construct()
        // {   
        // }

        public function setBuilder(Builder $builder):void{
            $this->builder = $builder; 
        }

        public function buildSimple(){
            $this->builder->producePartA();
        }

        public function complex(){
            // $this->builder->producePartA();
            // $this->builder->producePartB();
            // $this->builder->producePartC();
            $this->builder->producePartA()->producePartB()->producePartC();
        }
    }