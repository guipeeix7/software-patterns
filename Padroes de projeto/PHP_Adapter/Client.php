<?php 
require_once('Adapter.php');
require_once('Service.php');

function understandableRequest(Adapter $adapter){
    echo $adapter->request(); 
}

$adapter = new Adapter(new Service()); 
understandableRequest($adapter);