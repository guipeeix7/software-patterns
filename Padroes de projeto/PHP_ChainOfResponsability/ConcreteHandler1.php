<?php 
    require_once('BaseHandler.php'); 
    class ConcreteHandle1 extends BaseHandler{
        public function handle(string $request): ?string{
            if($request === "First"){
                echo "First handle done, content = (".$request.").. proceding\n";
            }
            return parent::handle($request); 
        }
    }