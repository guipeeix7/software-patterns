<?php 
abstract class Component{
    /**
     * A component needs to iterate thought childrens 
     *  
     *
     */
    public $isLeafNode; 
    public function __construct(Component $component){
        $this->isLeafNode = is_array($component) ? false : true; 
        return $component; 
    }
}