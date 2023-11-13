<?php  
    require_once('ConcreteComponent.php');
    require_once('ConcreteDecorator.php');
    require_once('ConcreteDecorator2.php');

    function requestData(){
        $component = new ConcreteComponent(); 
        $concreteDecorator = new ConcreteDecorator($component); 
        echo $concreteDecorator->operation(). "\n";;
        $concreteDecorator2 = new ConcreteDecorator2($component);
        echo $concreteDecorator2->operation(). "\n";                 
    
        //Could create a chain (> CRAAAAZZYYYYYYYYYY
        $wrappingAll = new ConcreteDecorator2($concreteDecorator2);
        echo $wrappingAll->operation()."\n"; 
        
        $wrappingAll2 = new ConcreteDecorator2($wrappingAll);
        echo $wrappingAll2->operation()."\n"; 
    }


requestData();
