<?php
require_once('Director.php');
require_once('ConcreteBuilder1.php');
require_once('ConcreteBuilder2.php');

function buildProduct(){
    $builder1 = new ConcreteBuilder1(); 
    
    $director = new Director();
    $director->setBuilder($builder1); 
    $director->complex(); 
    $builder1->getProduct()->listParts();
}


buildProduct(); 