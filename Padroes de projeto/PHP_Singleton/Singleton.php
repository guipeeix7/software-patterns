<?php 
    class SingletonClass{
        private static $instance; 
        public static $counter; 
        private function __construct(){}
        protected function __clone(){}
        public function __serialize(){throw new \Exception("Cannot unserialize a singleton.");}

        public static function getInstance(){
            if(!isset(self::$instance)){
                self::$instance = new static();
                self::$counter = 0; 
            }
            return self::$instance;
        }

        public static function ShowInstance(){
            self::$counter += 1; 
            echo self::$counter."\n"; 
            return self::$counter; 
        }
    }