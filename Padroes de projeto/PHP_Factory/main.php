<?php
require_once('Creator.php');
require_once('ConcreteCreator1.php');
require_once('ConcreteCreator2.php');

function clientCode(Creator $creator)
{
    echo "Client: I'm not aware of the creator's class, but it still works.\n";
    $creator->initiator();
}

clientCode(new ConcreteCreator1()); 
clientCode(new ConcreteCreator2()); 