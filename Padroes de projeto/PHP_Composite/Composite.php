<?php 
require_once('Component.php'); 

class Composite extends Component{
    public $total;
    public $tree; 
    protected Component $children; 

    public function __contruct(){}

    public function add(Component $component){
        return $this->tree[] = $leaf; 
    }
    
    public function removeComponent(string $key){
        $tree[array_search($key, $this->tree)] = []; 
    }
    
    public function getTotal(Component $tree){
        if(!($tree->isLeafNode == true)) return $tree->getLeafTotal();  
        foreach($this->tree as $node){
            $this->total = $node->getTotal($node); 
        }
    }
}