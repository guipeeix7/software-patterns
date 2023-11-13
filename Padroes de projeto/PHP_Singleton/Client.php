<?php
    require_once('Singleton.php');

    function start(){
        SingletonClass::getInstance()->ShowInstance();
        SingletonClass::getInstance()->ShowInstance();
        SingletonClass::getInstance()->ShowInstance();
    }   

start();