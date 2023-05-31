class LibCssTest extends PHPUnit\Framework\TestCase {
    public function testLoadScriptExisting() {
        $lib = new LibCss();
        $result = $lib->loadLib("skrypt.js", "script", "");
        $this->assertEquals("Plik skrypt.js został załadowany", $result);
    }

    public function testLoadScriptNotExisting() {
        $lib = new LibCss();
        $result = $lib->loadLib("nieistnieje-skrypt.js", "script", "");
        $this->assertEquals("Plik skrypt.js nie istnieje", $result);
    }

    public function testLoadScriptWithVersion() {
        $lib = new LibCss();
        $result = $lib->loadLib("skrypt.js", "script", "v=123");
        $this->assertEquals("Plik skrypt.js został załadowany", $result);
    }

    public function testLoadStylesheetExisting() {
        $lib = new LibCss();
        $result = $lib->loadLib("arkusz.css", "stylesheet", "");
        $this->assertEquals("Plik arkusz.css został załadowany", $result);
    }

    public function testLoadStylesheetNotExisting() {
        $lib = new LibCss();
        $result = $lib->loadLib("nieistnieje-arkusz.css", "stylesheet", "");
        $this->assertEquals("Plik arkusz.css nie istnieje", $result);
    }
}