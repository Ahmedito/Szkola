class DataCompareTest extends PHPUnit\Framework\TestCase {
    public function testReadDataFromFileCsv() {
        $dataCompare = new DataCompare();
        $result = $dataCompare->readDataFromFile("data1.csv");
        $this->assertTrue($result);
        $this->assertTrue($dataCompare->hasCsvHead);
        $this->assertEquals([
            ['a', '123'],
            ['b', 'str'],
            ['c', 'false']
        ], $dataCompare->data);
    }

    public function testReadDataFromFileNotCsv() {
        $dataCompare = new DataCompare();
        $result = $dataCompare->readDataFromFile("data3.php");
        $this->assertFalse($result);
    }

    public function testWriteToDataBase() {
        $dataCompare = new DataCompare();
        $result = $dataCompare->writeToDataBase();
        $this->assertTrue($result);
    }
}