<?php 
    require_once('ConcreteHandler1.php'); 
    require_once('ConcreteHandler2.php'); 
    require_once('ConcreteHandler3.php'); 

    function clientRequest(Handler $handler){
        foreach(['First', 'Second', 'Third'] as $string){
            $handler->handle($string); 
        }
    }

$hand1 = new ConcreteHandle1(); 
$hand2 = new ConcreteHandle2(); 
$hand3 = new ConcreteHandle3();

$hand1->setNext($hand2)->setNext($hand3);

clientRequest($hand1);


