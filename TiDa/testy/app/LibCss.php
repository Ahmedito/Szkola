<?php
class LibCss{
    public function loadLib($name,$mode,$ver=null){
        
        $fileName = $name.'.'.$mode; //skrypt.js
        $pathName = dirname(__FILE__).''.$fileName;
        if(file_exists($pathName) ){
            $out = '<script>.$pathname</script>';
        }
        
        return $out;
    }
    
}
?>