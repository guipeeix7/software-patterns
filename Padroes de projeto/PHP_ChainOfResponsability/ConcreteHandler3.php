<?php 
    require_once('BaseHandler.php');

    class ConcreteHandle3 extends BaseHandler{
        public function handle(string $request): ?string{
            if($request === "Third"){
                echo "Third handle done, content = (".$request.").. proceding\n";
            }
            return parent::handle($request); 
        }
    }