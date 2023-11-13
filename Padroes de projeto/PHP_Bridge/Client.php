<?php 
require_once('ConcreteImplementationA.php');
require_once('ConcreteImplementationB.php');
require_once('Abstraction.php');
require_once('RefinedAbstraction.php');


function client(Abstraction $abstraction){
    echo $abstraction->methodA()."\n";
}

$implementationA = new ConcreteImplementationA();
$abstraction = new Abstraction($implementationA);
client($abstraction);

$implementationB = new ConcreteImplementationB();
$abstractionRefined = new RefinedAbstraction($implementationB);
client($abstractionRefined);