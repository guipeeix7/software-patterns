<?php 
    require_once('BaseHandler.php');

    class ConcreteHandle2 extends BaseHandler{
        public function handle(string $request): ?string{
            if($request == "Second"){
                echo "Second handle done, content = (".$request.").. proceding\n";
            }
            return parent::handle($request); 
        }
    }