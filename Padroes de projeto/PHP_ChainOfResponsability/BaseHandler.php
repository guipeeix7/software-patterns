<?php 
    require_once('Handler.php');

    abstract class BaseHandler implements Handler{
        public ?Handler $nextHandler = null; 

        public function setNext(Handler $handler): Handler{
            $this->nextHandler = $handler; 
            return $handler; 
        } 

        public function handle(string $request): ?string{
            if($this->nextHandler != null){
                return $this->nextHandler->handle($request);    
            }
            return null;
        }
    }