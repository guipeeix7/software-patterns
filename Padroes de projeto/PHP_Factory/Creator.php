<?php 
require('Product.php');

abstract class Creator{
    public abstract function initiator() : Product; 
    public abstract function someAction() : string; 
}