<?php
use PHPUnit\Framework\TestCase;
require('app/LibCss.php');
class LibCssTest extends TestCase{

public function setUp() : void {
	$this->instance = new LibCss();
}


    public function testLoadLib(){

        $exp1 ='<script> src="skrypt.js"</script>';
        $act1 =  $this->instance->loadLib('skrypt','js');

        $this->assertEquals(
            $exp1,
            $act1,
            '1st test'
        );

    }

}

?>
